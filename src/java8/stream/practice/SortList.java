package java8.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","E","C","D");
        //ascending order
        List <String> str=list.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(str);

        //descending order
        List <String> str1=list.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(str1);
    }
}
