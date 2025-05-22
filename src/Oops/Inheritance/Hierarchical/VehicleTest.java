package Oops.Inheritance.Hierarchical;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void fuelType() {
        System.out.println("Car uses petrol.");
    }
}

class Bike extends Vehicle {
    void fuelType() {
        System.out.println("Bike uses petrol or electric.");
    }
}

class Truck extends Vehicle {
    void fuelType() {
        System.out.println("Truck uses diesel.");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.fuelType();

        System.out.println();

        Bike b = new Bike();
        b.start();
        b.fuelType();

        System.out.println();

        Truck t = new Truck();
        t.start();
        t.fuelType();
    }
}
