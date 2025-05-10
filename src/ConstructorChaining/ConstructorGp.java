package ConstructorChaining;

public class ConstructorGp {
    ConstructorGp()
    {
        System.out.println("This is Gp class");
    }
}

class Parent extends ConstructorGp{
    Parent (){

        System.out.println("This is Parent class");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("This is child class");
    }

    public static void main(String[] args) {
        Child ch =new Child();
    }

}