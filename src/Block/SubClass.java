package Block;

public class SubClass {
    static{
        System.out.println("Static Block");
    }
    {
        System.out.println("Instance block");
    }
}

class SubB extends SubClass{
    public static void main(String[] args) {
        SubB b = new SubB();

    }
}
