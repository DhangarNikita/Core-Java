package String.Programs;

public class FinalVsImmutable {
    //what is final?  => pi = 3.14

    int a = 10;
    //what is immutable?  => not modifiable     Object

    public static void main(String[] args) {

        String s1 = "Java";
        s1 = s1.toUpperCase();  //JAVA

        final String s2 = "Java";//s2 = "Java Program";

        final int a =  100;
        // a =  2000;
    }
}
