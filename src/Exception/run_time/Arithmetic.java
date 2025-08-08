package exception.run_time;

public class Arithmetic {
    public static void main(String[] args){
       try{
           int a=10;
           int b=0;
           int c=a/b;
       }catch(ArithmeticException e){
          // e.printStackTrace();
           System.out.println(e.getMessage());
       }

       }
    }

