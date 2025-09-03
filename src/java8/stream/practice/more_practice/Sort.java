package java8.stream.practice.more_practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//5) How do you sort the given list of decimals in reverse order?

public class Sort {
    public static void main(String[] args) {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        decimalList.stream().sorted((o1,o2)->o2.compareTo(o1)).forEach(e-> System.out.println(e));


    }
}
