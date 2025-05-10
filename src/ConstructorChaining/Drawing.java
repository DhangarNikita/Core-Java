package ConstructorChaining;

class Shape {
    Shape(int area) {
        System.out.println("Area is " + area);
    }
}

class Square extends Shape {
    Square(int side) {
        super(side * side);  // passing calculated value to super constructor
        System.out.println("Side of square " + side);
    }
}

public class Drawing {
    public static void main(String[] args) {
        Square sq = new Square(5);
    }
}

