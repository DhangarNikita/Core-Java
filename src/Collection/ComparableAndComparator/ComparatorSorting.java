package Collection.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeComparator {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public EmployeeComparator(String firstName, String lastName, int age, double salary) {
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
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class FirstNameComparator implements Comparator<EmployeeComparator>{

    @Override
    public int compare(EmployeeComparator o1, EmployeeComparator o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}

public class ComparatorSorting {
    public static void main(String[] args) {
        List<EmployeeComparator> employeeList = new ArrayList<>();
        EmployeeComparator emp1 = new EmployeeComparator("Test", "Java", 25, 90000);
        EmployeeComparator emp2 = new EmployeeComparator("Abcd", "Language", 32, 70000);
        EmployeeComparator emp3 = new EmployeeComparator("Xyz", "Program", 29, 60000);
        EmployeeComparator emp4 = new EmployeeComparator("Network", "Strong", 35, 85000);
        EmployeeComparator emp5 = new EmployeeComparator("Karve Nagar", "Coffer", 20, 120000);

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);

        System.out.println("Before sorting "+employeeList);  //
        //Utility class  => Static methods
        FirstNameComparator firstNameComparator = new FirstNameComparator();
        Collections.sort(employeeList, firstNameComparator);
        System.out.println("After sorting using first Name "+employeeList);   //


        Comparator<EmployeeComparator> ageComparator = new Comparator<EmployeeComparator>() {
            @Override
            public int compare(EmployeeComparator o1, EmployeeComparator o2) {
                return o1.getAge() - o2.getAge();
            }
        };

        Collections.sort(employeeList, ageComparator);
        System.out.println("After sorting using age "+employeeList);   //

        Comparator<EmployeeComparator> salaryComparator = new Comparator<EmployeeComparator>() {
            @Override
            public int compare(EmployeeComparator o1, EmployeeComparator o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        };


    /*    Collections.sort(employeeList, salaryComparator);
        System.out.println("After sorting using salary "+employeeList);   //*/

    }
}

