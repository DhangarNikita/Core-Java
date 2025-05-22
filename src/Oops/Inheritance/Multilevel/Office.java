package Oops.Inheritance.Multilevel;

class Person {
    String name;
    int age;

    void setPersonDetails(String n, int a) {
        name = n;
        age = a;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int employeeId;
    String department;

    void setEmployeeDetails(String n, int a, int id, String dept) {
        name = n;
        age = a;
        employeeId = id;
        department = dept;
    }

    void displayEmployeeDetails() {
        displayPersonDetails();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize;
    String projectName;

    void setManagerDetails(String n, int a, int id, String dept, int team, String project) {
        name = n;
        age = a;
        employeeId = id;
        department = dept;
        teamSize = team;
        projectName = project;
    }

    void displayManagerDetails() {
        displayEmployeeDetails();
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
    }
}

public class Office extends Manager{
    public static void main(String[] args) {
        Office m = new Office();
        m.setManagerDetails("Nikita", 22, 101, "E&TC", 10, "Java");
        m.displayManagerDetails();
    }

}