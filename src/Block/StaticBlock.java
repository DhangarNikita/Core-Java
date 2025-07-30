package block;
// static block run before the main method execute
public class StaticBlock {
    static{
        int a= 10;
        int b=20;
        int c=a+b;
        System.out.println("This is a static block: "+c);
    }

    public static void main(String[] args) {

    }
}

