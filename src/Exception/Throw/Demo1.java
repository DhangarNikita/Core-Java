package Exception.Throw;

public class Demo1 {
    public static void main(String[] args) {
        try{
            ArithmeticException a = new ArithmeticException("Hello Java");
            throw a;
        }catch(ArithmeticException ae){ // a stored in ae
            System.out.println("Exception occurred "+ae); // append ae with a
            System.out.println(ae.getMessage());
        }
    }
}
