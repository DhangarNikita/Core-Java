package collection.demo_comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    private String name;
    private int id;
    private int age;

    public Student(String name, int id, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;

    }
}

public class StudentComparable {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Nikita", 101, 22));
        list.add(new Student("Saurabh", 200, 25));
        list.add(new Student("Rushika", 22, 20));
        list.add(new Student("Sneha", 104, 19));

        System.out.println("Before sorting : " + list);
        Collections.sort(list);
        System.out.println("After Sorting : " + list);
    }
}
