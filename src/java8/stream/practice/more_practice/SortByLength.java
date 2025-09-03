package java8.stream.practice.more_practice;

import java.util.Arrays;
import java.util.List;

//15) Given a list of strings, sort them according to increasing order of their length
public class SortByLength {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        listOfStrings.stream().sorted((o1, o2) -> o1.length()-o2.length()).forEach(e-> System.out.println(e));
    }
}
