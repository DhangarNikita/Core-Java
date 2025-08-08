package collection.practice;

import java.util.ArrayList;

//19. Write a Java program for trimming the capacity of an array list.

public class TrimSize {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(20);
        list.add(50);
        list.add(10);
        list.add(90);
        list.add(80);
        list.add(60);

        System.out.println(list.size());

        list.trimToSize();
        System.out.println(list.size());
    }
}
