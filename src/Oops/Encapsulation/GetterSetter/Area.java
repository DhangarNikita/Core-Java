package oops.encapsulation.GetterSetter;


public class Area
{
    private double l, b, r; // length, breadth, and radius.

    // Create getter methods for each variable.
    public double getL() {
        return l;
    }
    public double getB() {
        return b;
    }
    public double getR() {
        return r;
    }

    // Create setter methods for each variable in the class.
    public void setL(double l) {
        this.l = l;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setR(double r) {
        this.r = r;
    }
    // logic to calculate the area and perimeter of rectangle

    public double areaRec() {
        double area = l * b;
        return area;
    }
    public double perRec() {
        double per = 2 * (l + b);
        return per;
    }
    public double areaCircle() {
        double area = 3.14 * r * r;
        return area;
    }
    public double circumCircle() {
        double circumference = 2 * 3.14 * r;
        return circumference;
    }
}

class MyTest {
    public static void main(String[] args)
    {
        Area ar = new Area();

// Set the values of the variables.
        ar.setL(20.5);
        ar.setB(30.5);
        ar.setR(12.5);


        double areaRec = ar.areaRec();
        double perRec = ar.perRec();
        double areaCircle = ar.areaCircle();
        double circumCircle = ar.circumCircle();

        System.out.println("Area of rectangle: " +areaRec);
        System.out.println("Perimeter of rectangle: " +perRec);
        System.out.println("Area of circle: " +areaCircle);
        System.out.println("Circumference of circle: " +circumCircle);
    }
}
