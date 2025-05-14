package Polymorphism.Overriding;


class Parent {
    void display(){
        System.out.println("Parent Class Method");
    }
}
public class Downcasting extends Parent {
    @Override
    void display() {
        System.out.println("Child Class Method");
    }

    public static void main(String[] args) {
        Parent p = new Downcasting();
        Downcasting d = (Downcasting) p;
        d.display();
    }
}
