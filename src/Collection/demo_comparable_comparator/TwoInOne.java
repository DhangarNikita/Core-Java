package collection.demo_comparable_comparator;


import java.util.*;

class Combine implements Comparable<Combine> {
    private String name;
    private int id;
    private int age;

    public Combine(String name, int id, int age) {
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
        return "Combine{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Combine o) {
        return this.id - o.id;
    }
}

public class TwoInOne {
    public static void main(String[] args) {
        List<Combine> list = new ArrayList<>();
        list.add(new Combine("Nikita", 11, 22));
        list.add(new Combine("Saurabh", 200, 25));
        list.add(new Combine("Rushika", 22, 20));
        list.add(new Combine("Sneha", 104, 19));

        System.out.println("Sorting using comparable");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Sorting using comparator for age");
        Collections.sort(list, new Comparator<Combine>() {
            @Override
            public int compare(Combine o1, Combine o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(list);

        System.out.println("Sorting using comparator for id");
        Collections.sort(list, new Comparator<Combine>() {
            @Override
            public int compare(Combine o1, Combine o2) {
                return o1.getId() - o2.getId();
            }
        });
        System.out.println(list);
    }
}