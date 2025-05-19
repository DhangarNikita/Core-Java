package Static;

public class Simple {
    static int a=10;
    int b =20;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(Simple.a);
        //System.out.println(b);  //Non-static field 'b' cannot be referenced from a static context for this we have to create object.
    }
    }
