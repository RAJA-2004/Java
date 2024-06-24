
package Exam;
import java.util.*;
public class producerConsumer {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Thread t1 = new Producer(queue,10,"PRODUCER");
        Thread t2 = new Consumer(queue,10,"CONSUMER");

        t1.start();
        t2.start();
    }
}

class Producer extends Thread{
    private Queue<Integer> queue;
    private int maxSize;
    private int count = 0;

    Producer(Queue<Integer> queue,int maxSize,String name){
        super(name);
        this.queue = queue;
        this.maxSize = maxSize;
    }

    public void run(){
        while(true){
            synchronized(queue){
                while(queue.size()==maxSize){
                    try{
                        System.out.println("queue is full ... ");
                        queue.wait();
                    } catch(Exception e){
                        e.printStackTrace();
                    }
                }
                count++;
                System.out.println("Produced : " + count);
                queue.add(count);
                queue.notify();
            }
        }
    }
}

class Consumer extends Thread{
    private Queue<Integer> queue;
    private int maxSize;

    Consumer(Queue<Integer> queue,int maxSize,String name){
        super(name);
        this.queue = queue;
        this.maxSize = maxSize;
    }

    public void run(){
        while(true){
            synchronized(queue){
                while(queue.isEmpty()){
                    try{
                        System.out.println("queue is empty ... ");
                        queue.wait();
                    } catch(Exception e){
                        e.printStackTrace();
                    }
                }
                System.out.println("Consumed : " + queue.remove());
                queue.notify();
            }
        }
    }
}