package Block;

public class ConstructorStacIn {
    static{
        System.out.println("static block 1");
        
    }
    {
        System.out.println("instance block 1");
    }
    ConstructorStacIn(){
        System.out.println("ConstructorStacIn Constructor");
    }
}

class Test extends ConstructorStacIn{
    static{
        System.out.println("static block 2");
    }

    {
        System.out.println("instance block 2");
        {
            System.out.println("instance block 3");
        }
    }


    Test(){
        System.out.println("Test constructor");
    }

    public static void main(String[] args) {
        Test ts = new Test();
    }
}