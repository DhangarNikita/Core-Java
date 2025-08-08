package oops.abstraction;
// Oops.Polymorphism.Abstraction means hiding the internal implementation details and
// showing only the essential functionalities to the user.


public abstract class UsingAbstraction {
    abstract void makeSound();
    UsingAbstraction(){
        System.out.println("Constructor of abstract class");
    }

}

class Dog extends UsingAbstraction{
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends UsingAbstraction{
    void makeSound(){
        System.out.println("Meow");
    }
}

class Animal{
    public static void main(String[] args) {
        Dog dg = new Dog();
        Cat ct = new Cat();

        dg.makeSound();
        ct.makeSound();
    }

}