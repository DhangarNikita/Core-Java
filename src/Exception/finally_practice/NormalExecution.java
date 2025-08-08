package exception.finally_practice;

public class NormalExecution {
    public static void main(String[] args) {
        try{
            int a=10 ,b=20;
            int c =10*20;
            System.out.println(c);
        }catch (ArithmeticException a)
        {
            System.out.println("Exception Handled");
        }
        finally{
            System.out.println("Finally block execute at every time");
        }
        System.out.println("Normal Execution");
    }
}
