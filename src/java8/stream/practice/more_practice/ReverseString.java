package java8.stream.practice.more_practice;

import java.util.Arrays;
import java.util.stream.Collectors;

//18) Reverse each word of a string using Java 8 streams?
public class ReverseString {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";

        String reverse = Arrays.stream(str.split(" ")).map(st->new StringBuffer(st).reverse()).collect(Collectors.joining(" "));
        System.out.println(reverse);
    }
}
