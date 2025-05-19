package Static;
// we call static members in another class using class name
public class AnotherClass
{
    static int x = 20; // static variable
    static int y = 30; // static variable
}
class CalculationTest {
    void addition()
    {
        int a = AnotherClass.x; // Since the returning value is an integer, we will store it by using a variable a of type int.
        int b = AnotherClass.y;
        int c = a + b;
        System.out.println(c);
    }
    void subtraction()
    {
        int p = AnotherClass.x;
        int q = AnotherClass.y;
        int r = p - q;
        System.out.println(r);
    }
    public static void main(String[] args)
    {
        CalculationTest ct = new CalculationTest();
        ct.addition();
        ct.subtraction();
    }
}
