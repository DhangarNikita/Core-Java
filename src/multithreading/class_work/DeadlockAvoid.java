package multithreading.class_work;

public class DeadlockAvoid {
    final static String R1 = "Hello Welcome to Scaler!";
    final static String R2 = "Visit Scaler!";

    public static void main(String[] args) {
        Thread T1 = new Thread() {
            public void run() {
                synchronized (R1) {
                    System.out.println("Thread T1 locked -> Resource R1");
                    synchronized (R2) {
                        System.out.println("Thread T1 locked -> Resource R2");
                    }
                }
            }
        };
        Thread T2 = new Thread() {
            public void run() {
                synchronized (R2) {
                    System.out.println("Thread T2 locked -> Resource R2");
                    synchronized (R1) {
                        System.out.println("Thread T2 locked -> Resource R1");
                    }
                }
            }
        };
        T1.start();
        T2.start();
    }
}
