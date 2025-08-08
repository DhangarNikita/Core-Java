package exception.finally_practice;
/*
exception has occurred in the catch block, not inside try block,
so catch block will not be executed and the control will directly go to execute finally block.
This is because exception that occurred in the catch is not part of the try block.
*/

public class Case4 {
    public static void main(String[] args) {
        try{
            System.out.println(2+4);
        }catch(ArithmeticException e){
            System.out.println(10/0);
        }
        finally{
            System.out.println("Finally block");
        }
        System.out.println("End of code");
    }
}
