package Exception.Throw;

public class Demo3 {
    public static void main(String[] args) {

        for(int i =1; i<=10;i++){
            try{
                if(i==5){
                    throw new ArithmeticException("I is equal to 5");
                }
                else if (i<2){
                    throw new RuntimeException("i is less than 1");
                }else if (i>9){
                    throw new NullPointerException("i is greater than 9");
                }
            } catch (Exception e) {
                System.out.println("Exception Occurred");
                System.out.println(e.getMessage());
            }
        }
    }
}
