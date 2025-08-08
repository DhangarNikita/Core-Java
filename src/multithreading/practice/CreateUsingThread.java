package multithreading.practice;

public class CreateUsingThread extends Thread{

    public void run(){
        for(int i=0; i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }

    }

    public static void main(String[] args) {
        CreateUsingThread ct = new CreateUsingThread();
        CreateUsingThread ct1 = new CreateUsingThread();

        ct.setName("Nikita");
        ct1.setName("Ruchita");

        ct.start();
        ct1.start();

    }
}

/*
class print extends Thread, MyThread {

// not possible

}*/
