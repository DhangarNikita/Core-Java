package java8.stream.practice;

import java.util.Arrays;
import java.util.List;

public class SelectionOperation {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(1,2,3,3,5,6,2);

        System.out.println("Original list");
        System.out.println(list);

        System.out.println("List convert to stream");
        list.stream().forEach(System.out::print);

        System.out.println();
        System.out.println("Filter less than equal to 3");
        list.stream().filter((i)->i<=3).forEach(System.out::print);

        System.out.println();
        System.out.println("Remove duplicate");
        list.stream().distinct().forEach(System.out::print);

        System.out.println();
        System.out.println("print upto limi 3");
        list.stream().limit(3).forEach(System.out::print);

        System.out.println();
        System.out.println("Skip 3 from starting");
        list.stream().skip(3).forEach(System.out::print);


    }
}
