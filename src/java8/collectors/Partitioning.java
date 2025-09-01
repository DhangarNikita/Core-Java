package java8.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partitioning {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,6,8,10,4,11,15,80,63,250);

        //How do you partition a list of numbers into two groups: greater than 10 and less than 10

        Map<Boolean,List<Integer>> map = list.stream().collect(Collectors.partitioningBy(n->n>10));
        System.out.println(map);

    }
}
