package exception.compile_time;

public class Interrupted {
    public static void main(String[] args) {

        System.out.println("Java Technology");


        //Exception Occured
//        Thread.sleep(1000);

        //Exception Handled
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
