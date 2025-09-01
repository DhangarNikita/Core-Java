package java8.collectors;

import java.util.*;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Set<String> set = new HashSet<>(words);

        Map<String, Integer>map =set.stream().collect(Collectors.toMap(n->n, str->str.length()));
        System.out.println(map);

    }
}
