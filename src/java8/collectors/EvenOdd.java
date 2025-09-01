package java8.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //How do you group a list of numbers into even and odd using streams
        System.out.println("Group a list of numbers into even and odd using streams");
        Map<String,List<Integer>> map= list.stream().collect(Collectors.groupingBy(n->n%2==0? "Even":"Odd"));
        System.out.println(map);



    }
}
