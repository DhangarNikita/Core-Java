package Thread.Synchronization;

public class SynchronizedBlock implements Runnable{
    public void run(){
        System.out.println("Threads in running state");
        synchronized(this){
            for(int i=0; i<=5;i++){
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }
        System.out.println("Hello");
        System.out.println("Java");
    }

    public static void main(String[] args) {
        SynchronizedBlock sync = new SynchronizedBlock();

        Thread t1 = new Thread(sync, "t1");
        Thread t2 = new Thread(sync,"t2");

        t1.start();
        t2.start();
    }
}
