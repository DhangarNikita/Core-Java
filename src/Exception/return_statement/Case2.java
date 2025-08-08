package exception.return_statement;
// Return statement in try block and end of method.
public class Case2 {
    int m2()
    {
        try {
            System.out.println("I am in try block");
            return 50;
        }
        catch(Exception e)
        {
            System.out.println("I am in catch block");
        }
        return 10;
    }
    public static void main(String[] args)
    {
        Case2 cs = new Case2();
        System.out.println(cs.m2());
    }
}
