package Thread.Class;

public class ThreadClassOps extends Thread{

    public static void main(String[] args) {
        ThreadClassOps obj = new ThreadClassOps();  //Thread

        //obj.run();
        obj.start();
        // obj.start();   //

        ThreadClassOps obj1 = new ThreadClassOps();  //Thread

        //obj.run();
        obj1.start();
    }

    @Override
    public void run() {
        System.out.println("Inside Run method");
        test();
    }

    void test(){

    }
}
