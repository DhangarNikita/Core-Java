package static_practice;


public class ThisTest
{
    // Declare instance variables.
    int x = 10;
    int y = 20;

    // Declare a static method with two parameters x and y with data type integer.
    static void add(int x, int y)
    {
        System.out.println(x + y); // Compile time error.
    }

    public static void main(String[] args)
    {
        ThisTest.add(20, 30);
    }
}