package java8.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> listOfNames = Arrays.asList("sumit", "rohit", "kailash", "lucky", "joney", "rohit");
        List<String> list =listOfNames.stream().distinct().collect(Collectors.toList());
        System.out.println(list);
    }
}
