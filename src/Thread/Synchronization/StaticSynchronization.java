package Thread.Synchronization;

public class StaticSynchronization  implements Runnable{
    public void run(){
        display();
    }

    static synchronized void display(){
        for(int i=0; i<=5; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        StaticSynchronization st = new StaticSynchronization();
        StaticSynchronization st1 = new StaticSynchronization();

        Thread t1 = new Thread(st,"t1");
        Thread t2 = new Thread(st1,"t2");
        t1.start();
        t2.start();
    }
}
