package Exception.TryCatch;
// Multiple try catch block
public class MultiCatchEx1 {
    public static void main(String[] args) {
        try{
            int x= 10/0;
            System.out.println(x);
        }

        catch (NullPointerException n)
        {
            System.out.println("NullPointerException");
        }
        catch (ArithmeticException a)
        {
            System.out.println("ArithmeticException");
        }
        catch (RuntimeException e)
        {
            System.out.println("RuntimeException");
        }
    }
}
