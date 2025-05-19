package Static;
// we can change static value using only constructor and static block
public class Demo
{
    static int a = 20;
    static int b = 50;
    static int c = 100;

    Demo()
    {
        a = 3; // Changed value of variable.
    }
    static  // static block
    {
        b = 10;
    }
    void m1()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c); // It will print 100.
    }
    static void m2()
    {
        c = 200;
    }
    void m3()
    {
        c = 200;
    }
    public static void main(String[] args)
    {
// Creating an object of Demo class.
        Demo d = new Demo();
        d.m1(); // Calling instance method.
    }
}
