package java8.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 12, 8, 20, 3, 15, 7);

        //ascending order
        List<Integer> lt = list.stream().sorted((n1,n2)->n1-n2).collect(Collectors.toList());
        System.out.println(lt);

        //descending order
        List <Integer> lt1= list.stream().sorted((n1,n2)->n2-n1).collect(Collectors.toList());
        System.out.println(lt1);


    }
}
