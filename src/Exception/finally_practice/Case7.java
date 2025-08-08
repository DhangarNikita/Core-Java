package exception.finally_practice;
/*exceptions occur in try block as well as finally block but the thrown
exception object has not matched with the corresponding catch block
the program will be terminated abnormally but before the termination of program, JVM will go to execute finally block.*/
public class Case7 {
    public static void main(String[] args) {
        String s = "Nkita";
        try
        {
            System.out.println("111");
            System.out.println(20/0);
            System.out.println("222");
        }
        catch(NullPointerException ne)
        {
            System.out.println("333");
        }
        finally
        {
            s=null;
            System.out.println(s.length()); // Exception occurred in finally block.
        }
        System.out.println("555");
    }
}



