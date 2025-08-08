package multithreading.class_work;

public class MyThread extends Thread {
    // Override the run() method to define the thread's task
  public void run() {
        // Using for loop to print numbers from 1 to 5.
        for (int i = 1; i <= 5; i++) {
            // Print the current thread's name and the current number
            System.out.println(Thread.currentThread().getName() + ": " + i);


            try {
                // Pause the thread for 500 milliseconds.
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e); // Handle any interruptions.
            }
        }
    }
}

class MultithreadingTest {
    public static void main(String[] args) {
        // Creating two objects of MyThread.
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
      //  t1.setName("Nikita");
      //  t2.setName("Ruchita");
        // Start the first thread.
        t1.start();
        // Start the second thread.
        t2.start();
    }
}

