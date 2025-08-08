package exception.custom_exception;

public class MyCustomThrowable extends Throwable {

    public MyCustomThrowable(){
        super("you cant vote");

    }
    public MyCustomThrowable(String message) {
        super(message);
    }
}

class Test {
    public static void main(String[] args) {
        try {
            throw new MyCustomThrowable("Custom Throwable thrown!");
        } catch (MyCustomThrowable e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
