package exception.try_catch;

import java.util.Scanner;
// We place superclass exception first and later on subclass exception

public class UnreachableCatch {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("Enter your first number");
            x = sc.nextInt();
            System.out.println("Enter your second number");
            y = sc.nextInt();

            int z = x / y;
            System.out.println("z = " +z);
        }
        catch(RuntimeException re)
        {
            System.out.println("Exception thrown: " +re);
        }
   /* catch(ArithmeticException ae) // Unreachable catch block error.
    {
        System.out.println("Exception thrown: " +ae);
    }
    catch(NumberFormatException nfe) // Unreachable catch block error.
    {
        System.out.println("Exception thrown: " +nfe);
    }*/
    }
}
