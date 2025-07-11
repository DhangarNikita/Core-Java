// runnable interface is preferred because we can extend this class and same resource we can pass

package Thread.Practice;

import Thread.Class.MyThread;

public class CreateUsingRunnable implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        CreateUsingRunnable cr = new CreateUsingRunnable();
        Thread t1 = new Thread(cr ,"T1");
        Thread t2 = new Thread (cr, "T2");

        t1.start();
        t2.start();

    }
}

class Print extends MyThread implements Runnable{
    // possible
}
