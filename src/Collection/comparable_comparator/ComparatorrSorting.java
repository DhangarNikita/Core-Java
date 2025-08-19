package collection.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee1 {
    private String firstName;
    private String lastName;
    private int age;
    private long salary;

    public Employee1() {
    }

    public Employee1(String firstName, String lastName, int age, long salary) {
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

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

}

class AgeComparator implements Comparator<Employee1> {

    @Override
    public int compare(Employee1 o1, Employee1 o2) {
        return o1.getAge() - o2.getAge();
    }
}

class SalaryComparator implements Comparator<Employee1> {

    @Override
    public int compare(Employee1 o1, Employee1 o2) {
        return Math.toIntExact(o1.getSalary() - o2.getSalary());
    }
}

public class ComparatorrSorting {

    public static void main(String[] args) {

        Employee1 saurabh = new Employee1("Saurabh", "Chavan", 25, 90000);
        Employee1 ganesh = new Employee1("Ganesh", "Shinde", 19, 155000);
        Employee1 nikita = new Employee1("Nikita", "Dhangar", 24, 100000);
        Employee1 piya = new Employee1("Piya", "Jadhav", 23, 120000);
        Employee1 reshma = new Employee1("Reshma", "Mahadik", 21, 95000);

        List<Employee1> employeeList = new ArrayList<>();
        employeeList.add(saurabh);
        employeeList.add(reshma);
        employeeList.add(nikita);
        employeeList.add(ganesh);
        employeeList.add(piya);

        System.out.println("Before Sorting " + employeeList);

        AgeComparator ageComparator = new AgeComparator();

        Collections.sort(employeeList, ageComparator);

        System.out.println("After Age Sorting " + employeeList);

        System.out.println("===================== ");

        System.out.println("Using Salary Sorting " + employeeList);

        SalaryComparator salaryComparator = new SalaryComparator();

        Collections.sort(employeeList, salaryComparator);

        System.out.println("After Salary Sorting " + employeeList);
    }
}
