package java8.stream.practice;
/*
Remove duplicates
Filter only even numbers
Skip the first 2 even numbers
Limit the output to next 3 numbers
Print the result*/

import java.util.Arrays;
import java.util.List;

public class FilterAndSkip {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 4, 6, 7, 8, 9, 10, 10, 12);
        numbers.stream().
                distinct().
                filter(i->i%2==0).
                skip(2).
                limit(3).
                forEach(System.out::println);

    }
}
