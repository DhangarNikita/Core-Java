package exception.try_catch;

public class TryCatchEx3 {
    public static void main(String[] args) {
        System.out.println("Statement 1");
        try{
            int x=10/0;
            System.out.println("Statement 2");
            System.out.println("Statement 3");

        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
