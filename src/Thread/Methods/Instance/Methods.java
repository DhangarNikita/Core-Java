package Thread.Methods.Instance;
import Thread.Practice.Multithreading;
public class Methods implements Runnable {
    public void run(){


        System.out.println(Thread.currentThread().getName());
        addition();
    }

    void addition(){
        int a=10, b=20,c;
        c=a+b;
        System.out.println(c);
    }
    public static void main(String[] args){
        Methods m = new Methods();

        Thread t1 = new Thread(m);
        t1.setPriority(10);
        Thread t2 = new Thread(m);
        t2.setPriority(2);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        t2.start();
        boolean b = t1.isAlive();
        System.out.println("thread t1 is isAlive "+b);
    }
}

