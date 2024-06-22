package ExceptionHandling;
import java.util.*;
public class test {
    public static void main(String[] args) {
        Company c = new Company();
        Producer p = new Producer(c);
        Consumer cp = new Consumer(c);

        p.start();
        cp.start();
    }
}

class Company {
    int n;
    boolean f = false;

    synchronized public void produced(int n)throws Exception {
        if (f) {
            wait();
        }
        this.n = n;
        System.out.println("produced " + this.n);
        f = true;
        notify();
    }

    synchronized public int consumed()throws Exception {
        if (!f) {
            wait();
        }
        System.out.println("consumed " + this.n);
        f = false;
        notify();
        return this.n;
    }
}

class Producer extends Thread {
    Company c;

    Producer(Company c) {
        this.c = c;
    }

    public void run() {
        int i = 1;
        while (true) {
            this.c.produced(i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
            	System.out.println(e.getMessage());
            }
            i++;
        }
    }
}

class Consumer extends Thread {
    Company c;

    Consumer(Company c) {
        this.c = c;
    }

    public void run() {
        while (true) {
            this.c.consumed();
            try {
                Thread.sleep(1000);
            }catch (Exception e) {
                // TODO: handle exception
                System.out.println(e.getMessage());
            }
        }
    }
}