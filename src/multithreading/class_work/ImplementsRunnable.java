package multithreading.class_work;

public  class ImplementsRunnable implements Runnable{

    public static void main(String[] args) {
        ImplementsRunnable obj = new ImplementsRunnable();   //Runnable

        Thread thread = new Thread(obj);

        if(thread instanceof Thread){
            System.out.println("Yes thread is instance of Thread class");
        }

        if(thread instanceof Runnable){  //
            System.out.println("Yes thread is instance of Runnable ");
        }

        if(obj instanceof Runnable){
            System.out.println("Yes obj is instance of Runnable ");
        }
    }

    @Override
    public void run() {

    }
}
