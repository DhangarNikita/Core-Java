package exception.finally_practice;
/*
exceptions have raised in both try and catch block
the program will terminate abnormally by the default exception handler.
But before termination of the program, JVM will go to execute only finally block.
*/

public class Case5 {
    public static void main(String[] args) {
        try
        {
            System.out.println("111");
            System.out.println(20/0);
            System.out.println("222");
        }
        catch(Exception ae)
        {
            System.out.println(10/0);
        }
        finally
        {
            System.out.println("444");
        }
        System.out.println("555");
    }
}


