package multithreading.methods.Instance;

public class DaemonThread implements Runnable{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println(Thread.currentThread().getName()+" is a daemon thread" );
        }else{
            System.out.println(Thread.currentThread().getName()+" is not a daemon thread" );
        }
    }

    public static void main(String[] args) {
        DaemonThread dm = new DaemonThread();
        System.out.println("Main Thread Start");

        Thread t1 = new Thread(dm, "t1");
        t1.setDaemon(true);

        Thread t2 = new Thread(dm,"t2");
        t1.start();
        t2.start();
    }
}
