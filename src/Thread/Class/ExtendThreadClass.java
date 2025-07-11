package Thread.Class;

public class ExtendThreadClass extends Thread{

    public static void main(String[] args) {
        ExtendThreadClass obj = new ExtendThreadClass();

        if(obj instanceof Thread){
            System.out.println("Yes obj is instance of Thread class");
        }
    }
}

