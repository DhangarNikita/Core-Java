package exception.return_statement;
// Return statement in try-catch block
public class Case5 {
    int m5()
    {
        try {
            System.out.println("I am in try block");
            return 50;
        }
        catch(Exception e)
        {
            System.out.println("I am in catch block");
            return 30;
        }
      //  System.out.println("Method at end"); // Unreachable code. So, compile time error will occur.

    }
    public static void main(String[] args)
    {
        Case5 cs5 = new Case5();
        System.out.println(cs5.m5());
    }
}
