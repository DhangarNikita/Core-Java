package java8.stream.practice.more_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {
    public static void main(String[] args) {
        //3) How do you find frequency of each character in a string using Java 8 streams?
        String str = "Java Concept Of The Day";
        Map<Character,Long> result = str.chars().mapToObj(c->(char)c).collect((Collectors.groupingBy(Function.identity(),Collectors.counting())));
        System.out.println("frequency of charactor"+result);


        //4) How do you find frequency of each element in an array or a list?
        List<String> stationery = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String, Long> fre = stationery.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Frequency of string element : "+fre);


    }
}
