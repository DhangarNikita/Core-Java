package multithreading.methods.Static;
/*
currentThread
yield
sleep
activeCount
 */
public class StaticMethods implements Runnable{
    public void run(){
        for(int i= 0; i<=5; i++){
            System.out.println(Thread.currentThread());
            //Thread.yield();  // pause the execution of current thread

            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){
                e.getMessage();
            }

        }
    }

    public static void main(String[] args) {
        StaticMethods sm = new StaticMethods();
        Thread t1 = new Thread(sm);
        Thread t2 = new Thread(sm);

        t1.start();
        t2.start();

        System.out.println("Active count is "+ Thread.activeCount()); //IntelliJ agent thread

    }

}
