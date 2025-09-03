package java8.stream.practice.more_practice;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        //1) Given a list of integers, separate odd and even numbers?
        List<Integer> list = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(e -> e%2==0));
        System.out.println(map);


        // last element
        int n = list.stream().skip(list.size()-1).findFirst().orElse(0);
        System.out.println("Last element is : "+n);

    }

}
