package multithreading.practice;

public class Multithreading implements Runnable{
    int a=10, b=20, c;
    public void run(){
        addition();
        substraction();

    }

    void addition(){

        c=a+b;
        System.out.println(Thread.currentThread().getName()+" Addition is "+ c);
    }

    void substraction(){
        c=a-b;
        System.out.println(Thread.currentThread().getName()+" Substraction is "+ c);
    }

    public static void main(String[] args) {
        Multithreading mt = new Multithreading();

        Thread t1 = new Thread(mt, "T1");
        Thread t2 = new Thread(mt, "T2");

        t1.start();
        t2.start();
    }

}
