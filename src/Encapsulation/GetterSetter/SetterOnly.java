package Encapsulation.GetterSetter;
//we will define only the setter method to set the value of the variable and make it write only

public class SetterOnly
{
    private int x, y, z;

    public void setX(int a) {
        x = a;
    }
    public void setY(int b) {
        y = b;
    }
    public void setZ(int c) {
        z = c;
    }

    void sum() {
        int s = x + y + z;
        System.out.println("Sum: " +s);
    }
}

class CalculateSum {
    public static void main(String[] args)
    {
// Create an instance of class Addition.
        SetterOnly a = new SetterOnly();

// Calling setter methods using reference variable a and passing argument values.
        a.setX(10);
        a.setY(20);
        a.setZ(30);
        a.sum();
    }
}
