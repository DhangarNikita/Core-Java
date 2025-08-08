package exception.try_catch;
/*
an exception object created in try block does not match with argument of catch block.
Therefore, the exception is not handled by catch block, and the program is terminated abnormally.
 */

public class TryCatchEx4 {
    void method(){
        System.out.println("This is a method");
        try{
            System.out.println("this is try block");
            int x=10/0;
        }catch(NullPointerException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        System.out.println("This is main method");
        TryCatchEx4 tc = new TryCatchEx4();
        tc.method();
    }
}
