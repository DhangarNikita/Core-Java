package multithreading.lifecycle;

public class DeadState extends Thread {

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + " is running.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " has finished execution.");
    }
}

class Test {
    public static void main(String[] args) {
        DeadState t = new DeadState();
        t.start();

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Is thread alive ? " + t.isAlive());
        System.out.println("Thread has reached DEAD state");
    }
}
