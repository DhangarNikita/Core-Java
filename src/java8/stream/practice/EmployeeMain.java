package java8.stream.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> list =new ArrayList<>();
        list.add(new Employee("101","Nikita","Dhangar","dhangar13@gmail.com","female","True",10000,5));
        list.add(new Employee("110","Zacharias","Schwerin","zchwerin@gmail.com","Male","True",101146,0));
        list.add(new Employee("110","Kyle","Frudd","kfrudd1@ovh.net","Male","FALSE",29310,2));
        list.add(new Employee("122","Axe","Gumb","agumb2@twitter.com","female","FALSE",62291,4));
        list.add(new Employee("99","Robinet","Batterham","rbatterham3@last.fm","Male","FALSE",142439,4));

        //We will filter the employees list with gender as Female
        list.stream().filter(emp->emp.getGender().equals("female")).forEach(e-> System.out.println(e));
        System.out.println();

        System.out.println("We will filter the employees list with newJoiner as True");
        //We will filter the employees list with newJoiner as True
        list.stream().filter(emp->emp.getNewJoiner(). equals("True")).forEach(e-> System.out.println(e));

        //We will sort the employee list by rating asc.
        System.out.println("We will sort the employee list by rating asc.");
        list.stream().sorted((e1,e2)->e1.getRating()- e2.getRating()).forEach(e-> System.out.println(e));

        //We will sort the employee list by rating desc.
        System.out.println("We will sort the employee list by rating desc.");
        list.stream().sorted((e1,e2)->e2.getRating()-e1.getRating()).forEach(e-> System.out.println(e));

        //We will sort the employee list by both rating and salary
        /*First compare ratings
          If ratings are equal
          compare salaries*/

        System.out.println("We will sort the employee list by both rating and salary");
        list.stream().sorted((e1, e2) -> {
            int ratingCompare =e1.getRating()- e2.getRating();
            if (ratingCompare == 0) {
                return e1.getSalary() -e2.getSalary();
            }
            return ratingCompare;
        }).forEach(e-> System.out.println(e));


        //sort in ascending order
        List<Employee> emp = list.stream().sorted((o1,o2)->o1.getFirstName().compareTo(o2.getFirstName())).collect(Collectors.toList());
        System.out.println(emp);

    }

    }




