package multithreading.deadlock;

public class Deadlock {

    //Object R1 = new Object();

    final static String r1 = "Pen";
    final static String r2 = "Paper";

    public static void main(String[] args)  {

        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (r1) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("Thread t1 : Locked r1");

                    synchronized (r2) {
                        System.out.println("Thread t1 : Locked r2");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                synchronized (r2) {
                    /*try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }*/
                    System.out.println("Thread t2 : locked r2");

                    synchronized (r1) {
                        System.out.println("Thread t1 : locked r1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
