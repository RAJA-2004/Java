import java.util.*;
public class pandc {
    public static void main(String[] args) {
        Queue<Integer> buffer = new LinkedList<>();
        int maxSize = 10;

        Thread producer = new Producer(buffer,maxSize,"PRODUCER");
        Thread consumer = new Consumer(buffer,maxSize,"CONSUMER");

        producer.start();
        consumer.start();
    }
}

class Producer extends Thread{
    private Queue<Integer> queue;
    private int maxSize;
    int count = 0;

    public Producer(Queue<Integer> queue,int maxSize, String name){
        super(name);
        this.queue = queue;
        this.maxSize = maxSize;
    }

    public void run(){
        while(true){
            synchronized(queue){
                while(queue.size()==maxSize){
                    try{
                        System.out.println("queue is full"+'\n');
                        queue.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                count++;
                System.out.println("producing value " + count);
                queue.add(count);
                queue.notify();
            }
        }
    }
}

class Consumer extends Thread{
    private Queue<Integer> queue;
    private int maxSize;

    public Consumer(Queue<Integer> queue,int maxSize, String name){
        super(name);
        this.queue = queue;
        this.maxSize = maxSize;
    }

    public void run(){
        while(true){
            synchronized(queue){
                while(queue.isEmpty()){
                    try{
                        System.out.println("queue is empty"+'\n');
                        queue.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
                System.out.println("consuming value " + queue.remove());
                queue.notify();
            }
        }
    }
}