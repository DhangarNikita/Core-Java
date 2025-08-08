package exception.finally_practice;
/*
Exception will be raised but it is not handled by the corresponding catch block.
JVM will hand over exception object to the default exception handler for abnormal termination of the program.
before handing over to the default exception handler, JVM will execute finally block.
JVM will not execute any given statements after finally block.
 */
public class Case3 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);

        }catch(NullPointerException e){
            System.out.println("NullPointerException occurred");
        }
        finally{
            System.out.println("Finally Block");
        }
        System.out.println("End of program");
    }
}
