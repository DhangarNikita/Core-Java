package exception.return_statement;
//Return statement in try block but do not have a return statement at the end of method

public class Case1 {
    int m1()
    {
        try {
            System.out.println("I am in try block");
            return 50;
        }
        catch(Exception e)
        {
            System.out.println("I am in catch block");
        }
       return 10;  // Here, no return statement at the end of method.
    }
    public static void main(String[] args)
    {
        Case1 cs = new Case1();
        System.out.println(cs.m1());
    }
}
