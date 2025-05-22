package Oops.Inheritance.Hierarchical;

// Parent class
public class Animal {
    void sound() {
        System.out.println("Animals make sound");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// Child class 3
class Cow extends Animal {
    void moo() {
        System.out.println("Cow moos");
    }
}


class TestHierarchy {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();   // From Animal
        d.bark();    // From Dog

        System.out.println();

        Cat c = new Cat();
        c.sound();   // From Animal
        c.meow();    // From Cat

        System.out.println();

        Cow cow = new Cow();
        cow.sound(); // From Animal
        cow.moo();   // From Cow
    }
}
