package block;

public class ConstructorStacIn {
    static{
        System.out.println("static block 1");

    }
    {
        System.out.println("instance block 1");
    }
    ConstructorStacIn(){
        this(10);
        System.out.println("ConstructorStacIn Constructor");
    }
    ConstructorStacIn(int a){
        System.out.println(a);
    }
}

class Test extends ConstructorStacIn{
    static{
        System.out.println("static block 2");
    }

    {
        System.out.println("instance block 2");

    }


    Test(){
        System.out.println("Test constructor");
    }

    public static void main(String[] args) {
        Test ts = new Test();


    }
}