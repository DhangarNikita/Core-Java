package java8.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//How do you concatenate all strings in a list into a single string using streams
public class Joining {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "is", "a","programming","language");
        String concat= words.stream().collect(Collectors.joining( " "));
        System.out.println(concat);
    }
}
