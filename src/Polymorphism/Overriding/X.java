package Polymorphism.Overriding;
// we can not override static method its method hiding process
public class X
{
    static void m1()
    {
        System.out.println("m1-X");
    }
}


 class Y extends X
{
   // @Override
    static void m1() // Compile time error because the method m1() of type Y must override or implement a supertype method.
    {
        System.out.println("m1-Y");
    }

    public static void main(String[] args)
    {
        X y = new Y();
        y.m1();
    }
}



