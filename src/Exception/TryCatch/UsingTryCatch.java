package Exception.TryCatch;
// simple try catch block

public class UsingTryCatch {
    public static void main(String[] args){
        System.out.println("writing arithmetic exception code");
        try{
            int x=10/0;

           /* int a=10;
            int b=0;
            int c=10/0;
            System.out.println(c);*/

        }catch(ArithmeticException e){
            System.out.println("ArithmeticException handle by using try catch block because we can not divide any number using 0");
        }
        System.out.println("End");
    }
}
