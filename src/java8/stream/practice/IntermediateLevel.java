package java8.stream.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateLevel {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(1,5,6,3,2,4,5,6,7);

        //How do you find the sum of a list of integers using streams
        System.out.println("find the sum of a list of integers using streams");
        int n = list.stream().reduce(0,(a,b)->a+b);
        System.out.println(n);

        // How do you find the maximum and minimum values in a stream
        System.out.println("find the maximum and minimum values in a stream?");
        int a= list.stream().min(Comparator.naturalOrder()).orElse(0);
        System.out.println("Min number is : "+a);

        int b = list.stream().max(Comparator.naturalOrder()).orElse(0);
        System.out.println("Max number is : "+b);

        //How do you find the average of numbers in a list using streams
        System.out.println("average of numbers in a list using streams");
        OptionalDouble num = list.stream().mapToInt(n1->n1).average();
        System.out.println(num);

        //How do you concatenate multiple lists into a single stream
        System.out.println("Concatenate multiple lists into a single stream");
        List<Integer> list2 = Arrays.asList(4, 5, 6);
       List<Integer> lt = Stream.of(list,list2).flatMap(s->s.stream()).collect(Collectors.toList());
        System.out.println(lt);

        //How do you find the second highest number in a list using streams
        System.out.println("second highest number in a list using streams");
        int secondHighest = list.stream().distinct().sorted((o1,o2)->o2.compareTo(o1)).skip(1).findFirst().orElse(0);
        System.out.println("Second highest number is : "+secondHighest);

        //How do you get the top 3 highest numbers from a list using streams
        System.out.println("Top 3 highest numbers from a list using streams");
        List<Integer> top =list.stream().distinct().sorted((o1,o2)->o2.compareTo(o1)).limit(3).collect(Collectors.toList());
        System.out.println(top);


        //How do you remove null values from a list using streams
        List<String> names = Arrays.asList("Nikita", null, "Sneha", "Ruchita", null, "Trisha");
        System.out.println("remove null values from a list using streams");
        List<String> notNull = names.stream().filter(not->not!=null).collect(Collectors.toList());
        System.out.println(notNull);

        //How do you find the longest word in a list using streams
        System.out.println("longest word in a list using streams");
        List<String> lst =Arrays.asList("java", "stream", "programming", "code", "developer");

        String large =lst.stream().max(Comparator.comparing(str->str.length())).orElse(null);
        System.out.println("longest word is : "+large);





    }
}
