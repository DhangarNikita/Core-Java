package java8.stream.practice;
//2. How do you convert a stream back to a list?
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBackToList {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4);
        List<Integer>list = stream.collect(Collectors.toList());
        System.out.println(list);
    }
}
