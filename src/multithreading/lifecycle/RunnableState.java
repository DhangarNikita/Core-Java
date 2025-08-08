package multithreading.lifecycle;

public class RunnableState implements Runnable {
    public static void main(String[] args) {
        RunnableState obj = new RunnableState();
        Thread t = new Thread(obj);

        System.out.println(t.getState());

        t.start();
        System.out.println(t.getState());

    }

    @Override
    public void run() {

    }
}
