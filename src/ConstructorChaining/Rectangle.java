package ConstructorChaining;

class Area{
  Area(int area){
      System.out.println("Area of rectangle is "+ area);
  }
}

class Calculate extends Area{
    Calculate(int l, int b){
        super(l*b);
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Calculate cl = new Calculate(20,30);
    }
}

