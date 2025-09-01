package java8.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//How do you create a stream from a list of integers?
public class StreamList {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream();
        stream.forEach(e-> System.out.println(e));
    }
}
