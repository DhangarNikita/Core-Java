package Oops.Inheritance.Single;

// Base class
public class Vehicle {
    String brand;
    String model;
    int year;

    void setVehicleDetails(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    void displayVehicleDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Derived class
class Car extends Vehicle {
    String fuelType;
    double mileage;

    void setCarDetails(String b, String m, int y, String fuel, double mile) {
        // Set parent fields directly
        brand = b;
        model = m;
        year = y;
        fuelType = fuel;
        mileage = mile;
    }

    void displayCarDetails() {
        displayVehicleDetails();
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + mileage + " km/l");
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setCarDetails("Toyota", "Corolla", 2020, "Petrol", 18.5);
        car1.displayCarDetails();
    }
}



