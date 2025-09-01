package collection.demo_comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeComparator {
    private String name;
    private int id;
    private int age;

    public EmployeeComparator(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "EmployeeComparator{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}

class SortComparator implements Comparator<EmployeeComparator> {
    @Override
    public int compare(EmployeeComparator o1, EmployeeComparator o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<EmployeeComparator> list = new ArrayList<>();
        list.add(new EmployeeComparator("Nikhil", 1, 22));
        list.add(new EmployeeComparator("Vivek", 1, 25));
        list.add(new EmployeeComparator("Saurabh", 1, 20));
        list.add(new EmployeeComparator("Shreyas", 1, 21));

        SortComparator sc = new SortComparator();
        Collections.sort(list, sc);
        System.out.println(list);
    }
}