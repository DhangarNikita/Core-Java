package This;

public class Test
{
    void m1(Test t)
    {
        System.out.println("m1 method is called");
    }
    void m2()
    {
        m1(this); // Passing this as an argument in the m1 method. this keyword will pass the reference of current class object to the m1 method.
    }
    public static void main(String[] args)
    {
        Test t = new Test();
        t.m2(); // m2 method is called.
    }
}
