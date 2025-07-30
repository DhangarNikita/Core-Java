package block;
// static block execute first then main method execute
public class Demo {
    static{
        System.out.println("Hello Static block");
    }

    public static void main(String[] args) {
        System.out.println("Hello main method");
    }
}
