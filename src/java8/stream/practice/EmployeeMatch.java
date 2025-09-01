package java8.stream.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMatch {
    public static void main(String[] args) {
        List<Employee> list =new ArrayList<>();
        list.add(new Employee("101","Nikita","Dhangar","dhangar13@gmail.com","female","True",235,5));
        list.add(new Employee("110","Zacharias","Schwerin","zchwerin@gmail.com","Male","True",101146,0));
        list.add(new Employee("110","Kyle","Frudd","kfrudd1@ovh.net","Male","FALSE",29310,2));
        list.add(new Employee("122","Axe","Gumb","agumb2@twitter.com","female","FALSE",62291,4));
        list.add(new Employee("99","Robinet","Batterham","rbatterham3@last.fm","Male","FALSE",142439,4));

        //We will see all employees with salary more than 1000
        System.out.println("We will see all employees with salary more than 1000");
        boolean b= list.stream().allMatch(emp->emp.getSalary()>1000);
        System.out.println(b);

        //We will retrieve employee with max salary

        /*list.stream().max((e1,e2)->(Integer.compare(e1.getSalary(),e2.getSalary())));
        System.out.println();*/

        list.stream().max(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);

        //We will retrieve employee with max rating
        list.stream().max(Comparator.comparing(Employee::getRating)).ifPresent(System.out::println);

        //We will retrieve employee with min salary
        list.stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);

        //We will retrieve employee with min rating
        list.stream().min(Comparator.comparing(Employee::getRating)).ifPresent(System.out::println);

        //We will group all our employees by Gender

        Map<String, List<Employee>> employeesBygender = list.stream()
                .collect(Collectors.groupingBy(Employee::getGender));

        employeesBygender.forEach(((g,e)->{
            System.out.println(g);
            e.forEach(System.out::println);
        }));



    }
}


