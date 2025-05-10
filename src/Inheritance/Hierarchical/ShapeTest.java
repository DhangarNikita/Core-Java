package Inheritance.Hierarchical;

// Parent class
class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

// Child class 1: Rectangle
class Rectangle extends Shape {
    void area() {
        int length = 5;
        int width = 3;
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

// Child class 2: Square
class Square extends Shape {
    void area() {
        int side = 4;
        System.out.println("Area of Square: " + (side * side));
    }
}

// Child class 3: Triangle
class Triangle extends Shape {
    void area() {
        int base = 6;
        int height = 4;
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

// Main class
public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.display();
        rect.area();

        System.out.println();

        Square sq = new Square();
        sq.display();
        sq.area();

        System.out.println();

        Triangle tri = new Triangle();
        tri.display();
        tri.area();
    }
}

