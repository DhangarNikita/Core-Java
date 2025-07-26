package Exception.CustomException;

class MyCustomException extends Exception {

   public  MyCustomException(){
        super("age is out of range");
    }

    public MyCustomException(String message) {
        super(message);
    }
}


class TestCustomException {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (MyCustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }

    static void validateAge(int age) throws MyCustomException {
        if (age < 18) {
            throw new MyCustomException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    }
}
