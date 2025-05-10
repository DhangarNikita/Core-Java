package ConstructorChaining;

class Person {
    Person(String name, int age) {
        System.out.println("Person name is " + name + " Person Age is " + age);
    }
}

class Employee extends Person {
    Employee(String name, int age, String dept) {
        super(name, age);
        System.out.println("Department: " + dept);
    }
}

public class Office {
    public static void main(String[] args) {
        Employee emp = new Employee("Nikita", 22, "E&TC");
    }
}

