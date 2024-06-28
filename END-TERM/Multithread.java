public class Multithread {
    public static void main(String[] args) {
        // MultithreadThing mythread = new MultithreadThing();
        // MultithreadThing mythread2 = new MultithreadThing();

        for(int i=0;i<3;i++){
            MultithreadThing mythread = new MultithreadThing(i);
            mythread.start();
        }

        // ! start does things simultaneously
        // mythread.start();
        // mythread2.start();

        // ! run does one after other
        // mythread.run();
        // mythread2.run();
    }
}
