package ConstructorChaining;

public class Animal {
    Animal(String type) {
        System.out.println("Animal constructor: Type = " + type);
    }
}

class Mammal extends Animal {
    Mammal(String species) {
        super("Vertebrate");
        System.out.println("Mammal constructor: Species = " + species);
    }
}

class Dog extends Mammal {
    Dog(String breed) {
        super("Canine");
        System.out.println("Dog constructor: Breed = " + breed);
    }

    public static void main(String[] args) {
        Dog d = new Dog("Labrador");
    }
}

