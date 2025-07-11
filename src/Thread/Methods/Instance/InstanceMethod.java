package Thread.Methods.Instance;

import Thread.Methods.Static.StaticMethods;

public class InstanceMethod implements Runnable{
    public void run(){
        for(int i= 0; i<=5; i++){

            System.out.println(Thread.currentThread() +" " + i);


        }
    }

    public static void main(String[] args) throws InterruptedException {
        InstanceMethod im = new InstanceMethod();
        Thread t1 = new Thread(im);
        Thread t2 = new Thread(im);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println("First Thread Name is "+t1.getName());
        System.out.println("Second Thread Name is "+t2.getName());

    }

}