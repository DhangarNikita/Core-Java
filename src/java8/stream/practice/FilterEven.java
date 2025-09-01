package java8.stream.practice;

import java.util.Arrays;
import java.util.List;

public class FilterEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,3,5,6,2);
        list.stream().distinct().filter(i->i%2==0).forEach(System.out::println);
    }
}
