package Polymorphism.Overriding;

public class Overriding {
    final static int a = 10;
    public void display(){
        System.out.println("Parent Class Method");
    }
}

class Child extends Overriding {
    @Override
    public void display() {
        super.display();
        System.out.println("Child Class Method");
    }

    public static void main(String[] args) {
        Overriding obj = new Child();
        obj.display();
        System.out.println(a);
    }
}
