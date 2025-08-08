package error;

public class StackOverflow {
    static void m1(){
        System.out.println("Call m2()");
        m2();
    }

    static void m2(){
        System.out.println("Call m1()");
        m1();
    }
    public static void main(String[] args) {
        m1();
    }
}
