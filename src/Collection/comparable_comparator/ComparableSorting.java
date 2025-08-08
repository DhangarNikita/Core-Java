package collection.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        //20 30 40 70 60 90 100
        //Returns:
        //a negative integer, zero, or a positive integer as
        // the first argument is less than, equal to, or greater than the second.

        //a negative integer when the first argument is less than the second.
        //zero when the first argument is the second.
        // a positive integer when as the first argument is  greater than the second.

        //a 20 20-30 -10
        //b 30 30-20 10

        //positive  =
        //negative =
        //zero = equal

        //return this.age - o.getAge();
        // return (int) (this.getSalary() - o.getSalary());
        int temp =  this.getFirstName().compareTo(o.getFirstName());
        if(temp == 0) {
            return this.getLastName().compareTo(o.getLastName());
        }
        return temp;
        // return this.getFirstName().compareTo(o.getFirstName());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class ComparableSorting {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee("A", "Language", 25, 90000);
        Employee emp2 = new Employee("A", "Javaa", 32, 70000);
        Employee emp3 = new Employee("D", "Program", 29, 60000);
        Employee emp4 = new Employee("F", "Strong", 35, 85000);
        Employee emp5 = new Employee("P", "Coffer", 20, 120000);

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);

        System.out.println("Before sorting "+employeeList);  //
        //Utility class  => Static methods
        Collections.sort(employeeList);
        System.out.println("After sorting "+employeeList);   //
        //dateFormatting()     50 => new object
    }
}
