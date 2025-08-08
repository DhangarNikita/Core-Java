package multithreading.class_work;

public class IntroToSynchronization implements Runnable{

    public static void main(String[] args) throws InterruptedException {
        IntroToSynchronization obj1 = new IntroToSynchronization();
        IntroToSynchronization obj2 = new IntroToSynchronization();
        IntroToSynchronization obj3 = new IntroToSynchronization();

        //multiple threads sharing same resource  => synchronized worked properly

        //multiple threads but each having its own resource  => synchronized does not work properly

        Thread t1 = new Thread(obj1);
        t1.setName("Ramesh");
        Thread t2 = new Thread(obj1);
        t2.setName("Suresh");
        Thread t3 = new Thread(obj1);
        t3.setName("Ganesh");

        //Threads
        //Starvation  =>

        t2.start();
       // t2.join();

        t1.start();
       // t1.join();

        t3.start();
       // t3.join();
        //

    }

    @Override
    public  void run() {
        //Deadlock and Producer/Consumer
        //inter Thread communication

        //object lock   OS scheduler
        //synchronized => we are acquiring lock on the Object
        //acquire lock and once we are done with our work we release that lock
        synchronized (this){  //t1 thread will acquire lock on obj1
            //t2 thread needs lock on obj2

            try{
                for(int i = 0; i < 3; i++){
                    System.out.println("Thread Name is "+Thread.currentThread().getName() + " with index value "+i);
                }
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

       /* System.out.println("Test message "+Thread.currentThread().getName());
        System.out.println("Test message 2 "+Thread.currentThread().getName());*/

    }
}
