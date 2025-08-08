package exception.throw_code;

public class Demo2 {
    public static void main(String[] args) {
        try{
           System.out.println(10/0);
            //System.out.println("Try block");

            throw new ArithmeticException();
            // System.out.println("Unreachable code"); // we can not write any statement after throw statement
        }catch (ArithmeticException ae){
            System.out.println("Exception occurred");
        }
        System.out.println("Hello");
    }
}
