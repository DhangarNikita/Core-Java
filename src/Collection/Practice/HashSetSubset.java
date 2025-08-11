package collection.practice;

import java.util.HashSet;

public class HashSetSubset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");

        HashSet<String> set1 = new HashSet<>();
        set1.add("C");
        set1.add("D");

        boolean sub = set.containsAll(set1);
        System.out.println("is set is sub set of set1 : "+sub);

    }
}
