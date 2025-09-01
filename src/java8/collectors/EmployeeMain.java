package java8.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> emp =new ArrayList<>();
        emp.add(new Employee("Nikita",1,"Hr"));
        emp.add(new Employee("Sneha",2,"developer"));
        emp.add(new Employee("Nikhil",3,"Hr"));
        emp.add(new Employee("Saurabh",4,"developer"));
        emp.add(new Employee("Rushika",5,"developer"));
        emp.add(new Employee("Madhura",6,"Hr"));
        emp.add(new Employee("Nhree",7,"developer"));
        emp.add(new Employee("Ruchita",8,"developer"));
        emp.add(new Employee("Monish",9,"Hr"));
        emp.add(new Employee("Shweta",10,"Hr"));



     /*   //How do you group a list of employees by department using streams
        Map<String,List<Employee>> map =emp.stream().collect(Collectors.groupingBy(em->em.getDepartment()));
        System.out.println(map);*/

       /* for(Map.Entry<String,List<Employee>> mp :map.entrySet()){
            System.out.println(mp.getKey()+" "+mp.getValue());
        }*/


//        Map<Character, List<Employee>> map1 = emp.stream().filter(n->(n<1&&n>3)).collect(Collectors.groupingBy(n->n.getName().charAt(0)));
        Map<Character, List<Employee>> map1 = emp.stream().filter(n->!(n.getId()>3&&n.getId()<=9)).collect(Collectors.groupingBy(n->n.getName().charAt(0)));
        System.out.println(map1);


        /*List<Employee> lt = emp.stream().filter(n->!(n.getId()>2&& n.getId()<=5)).filter(i->i.getName().startsWith("N")).toList();
        System.out.println(lt);*/

    }
}
