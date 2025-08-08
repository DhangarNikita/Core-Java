package exception.try_catch;

public class TryCatchEx2 {
    public static void main(String[] args) {
        System.out.println("Statement 1");
        try{
            System.out.println("Statement 2");
            System.out.println("Statement 3");
            int x=10/0;
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
