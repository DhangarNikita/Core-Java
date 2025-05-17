package CovariantReturnType;

public class A {
    public String m1() {
        System.out.println("Hello, this is a superclass");
        return null;
    }
}

class B extends A
{
    int a=10;

//    public Object m1()
//    {
//        System.out.println("Hello, this is the subclass");
//        return null;
//    }

public static void main(String[] args)
{
    A a = new B();
    a.m1();
}
}

