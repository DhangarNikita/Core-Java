package Exception.ReturnStatement;
// Return statement in try block and end of method but statement after return.
public class Case3 {
    int m3(){
        try{
            System.out.println("Try block");
            return 20;
        }catch(ArithmeticException ae){
            System.out.println("ArithmeticException");
        }
        return 10;
        //System.out.println("Statement after return");  //Unreachable code compile time error
    }

    public static void main(String[] args) {
        Case3 cs3 = new Case3();
        System.out.println(cs3.m3());
    }
}
