package Exception.ReturnStatement;
// Return statement in try block and at end of method but exception occurred in try block.
public class Case4 {
    int m4(){
        try{
            System.out.println("Try block");
            System.out.println(10/0);
            return 10;
        }catch(ArithmeticException ae){
            System.out.println("Arithmetic exception");
        }
        return 20;
    }

    public static void main(String[] args) {
        Case4 cs4 = new Case4();
        System.out.println(cs4.m4());
    }
}
