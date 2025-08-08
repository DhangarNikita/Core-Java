package multithreading.synchronization;
// Synchronized Method
public class SynchronizedMethod implements Runnable{
    public synchronized void run(){
        for(int i=0; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }

    }

    public static void main(String[] args) {
        SynchronizedMethod sy = new SynchronizedMethod();
        Thread t1 = new Thread(sy,"t1");
        Thread t2 = new Thread(sy,"t2");
        t1.start();
        t2.start();


    }
}
