package exception.try_catch;
/*
an exception occurred inside the try block of catch block has not handled.
This is because NullPointerException does not handle the arithmetic exception.
 */
public class TryCatchEx5 {

        public static void main(String[] args)
        {
            System.out.println("111");
            try
            {
                System.out.println("222");
                int y = 1/0;
            }
            catch(ArithmeticException e)
            {
                System.out.println("Hello");
                try
                {

                    int x = 20/0;
                }
                catch(NullPointerException np)
                {
                    System.out.println("333");
                }
            }
            System.out.println("444");
        }
    }
