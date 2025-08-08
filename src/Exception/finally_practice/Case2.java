package exception.finally_practice;
/*
the thrown exception by try is handled in the catch block and an
appropriate error message is displayed. After that, the code inside the finally block is executed by JVM.*/

public class Case2 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch(ArithmeticException a){
            System.out.println("ArithmeticException occurred which is handle by catch block");
        }
        finally{
            System.out.println("Finally block");
        }
    }
}
