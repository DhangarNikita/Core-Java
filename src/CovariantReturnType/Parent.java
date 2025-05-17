package CovariantReturnType;

public class Parent {
    Parent m1(){
        System.out.println("Hello Im parent class");
        return new Parent();   // passing object or null
    }
}

class Child extends Parent{
    @Override
    Child m1(){
        System.out.println("Hi Im child class");
        return new Child();   // passing object or null
    }

    public static void main(String[] args) {
        Child ch = new Child();
        ch.m1();
    }
}