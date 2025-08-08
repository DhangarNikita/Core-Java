package multithreading.lifecycle;

public class RunningState extends Thread {

    @Override
    public void run() {
        System.out.println("RUNNING");
    }

    public static void main(String[] args) {

        RunningState obj = new RunningState();
        Thread t = new Thread(obj);

        System.out.println(obj.getState());
        obj.start();

        System.out.println(obj.getState());
    }
}
