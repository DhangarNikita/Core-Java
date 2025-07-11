package Thread.Class;

public class Deadlock {
    final static String R1 = "Hello Welcome to Scaler!";
    final static String R2 = "Visit Scaler!";

    //anonymous class implementation   => Lambda expression
    //Heap dump => out of memory

    //how to identify if we have a deadlock in code   => we need to analyze Thread dump
    //how to resolve that deadlock condition   =>

    //wait notify
    //follow the lock acquiring and release order

    public static void main(String[] args) {
        // creating thread T1
        Thread T1 = new Thread() {
            // implementing run method
            public void run() {
                // thread T1 locking the R1 resource
                synchronized (R1) {
                    System.out.println("Thread T1 locked -> Resource R1");
                    // thread T1 locking the R2 resource
                    synchronized (R2) {
                        System.out.println("Thread T1 locked -> Resource R2");
                    }  //Released resource R2
                }
            }//Released resource R1
        };

        // creating thread T2
        Thread T2 = new Thread() {
            // implementing run method
            public void run() {
                // thread T2 locking the R2 resource
                synchronized (R1) {
                    System.out.println("Thread T2 locked -> Resource R2");
                    // thread T2 locking the R1 resource
                    synchronized (R2) {
                        System.out.println("Thread T2 locked -> Resource R1");
                    }
                }
            }
        };

        // starting both the threads
        T1.start();
        T2.start();
    }


}
