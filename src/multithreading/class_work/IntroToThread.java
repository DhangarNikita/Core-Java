package multithreading.class_work;

public class IntroToThread extends Thread{

    public static void main(String[] args) {
        IntroToThread thread  = new IntroToThread(); //New thread create   New
        //thread.stop();  //Dead

        thread.setName("Saurabh");

        thread.start();     //Runnable

        //thread.stop();  //Dead
    }

    @Override
    public void run() {    //Running
        System.out.println("Run method execution started ");

        try {
            Thread.sleep(1000);    //Blocked
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Thread class methods
    //Object class methods related to Threads   => Wait notify notifyAll => Object class
    //who creates main thread and manages it's life cycle?

}
