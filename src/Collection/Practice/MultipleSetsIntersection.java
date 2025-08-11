package collection.practice;

import java.util.HashSet;
import java.util.Set;

// 33. Write a program to find the intersection of multiple Sets.
public class MultipleSetsIntersection {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");
        set1.add("Date");

        Set<String> set2 = new HashSet<>();
        set2.add("Banana");
        set2.add("Cherry");
        set2.add("Fig");
        set2.add("Grapes");

        Set<String> set3 = new HashSet<>();
        set3.add("Banana");
        set3.add("Cherry");
        set3.add("Honeydew");

        Set<String> intersection = new HashSet<>(set1); // Start with set1
        intersection.retainAll(set2); // Keep common elements with set2
        intersection.retainAll(set3); // Keep common elements with set3

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Set 3: " + set3);
        System.out.println("Intersection of all sets: " + intersection);
    }
}
