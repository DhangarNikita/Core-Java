package java8.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class BasicLevel {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,11,3,16,5,20,7,8,9,10);

        //How do you find the count of elements in a stream?
        long num = list.stream().count();
        System.out.println(num);

        //How do you filter even numbers from a list using streams
        System.out.println("Even numbers are : ");
        list.stream().filter(n->n%2==0).forEach(e-> System.out.println(e));

        //How do you sort a list of numbers using streams
        System.out.println("Sort Elements");
        list.stream().sorted((o1,o2)->o1.compareTo(o2)).forEach(e-> System.out.println(e));

        //7. How do you limit a stream to the first 5 elements?
        System.out.println("Limit 5 Elements");
        list.stream().limit(5).forEach(e-> System.out.println(e));

        //8. How do you skip the first 3 elements in a stream?
        System.out.println("Skip 3 elements");
        list.stream().skip(3).forEach(e-> System.out.println(e));

        //How do you find the first element of a stream
        System.out.println("find the first element of a stream");
    /*    Optional<Integer> first = list.stream().findFirst();
        System.out.println(first);*/
        int value = list.stream().findFirst().orElse(-1);
        System.out.println( value);

        //How do you check if all elements in a stream match a given condition
        System.out.println("check if all elements in a stream match a given condition");
        boolean b = list.stream().allMatch(n->n>=5);
        System.out.println(b);

        //How do you check if any element in a stream matches a given condition
        System.out.println("check if any element in a stream matches a given condition");
        boolean m = list.stream().anyMatch(n-> n%2==0);
        System.out.println(m);

        //How do you remove duplicate elements from a list using streams
        System.out.println("remove duplicate elements from a list using streams");
        list.stream().distinct().forEach(e-> System.out.println(e));

        //How do you create a stream from an array
        System.out.println("Create a stream from an array");
        int [] arr ={1,2,2,4,5,7,7};
        Arrays.stream(arr).boxed().forEach(e-> System.out.println(e));

       /* // Infinite stream of random integers
        System.out.println("Infinite stream of random integers");
        Random random = new Random();
        Stream<Integer> randomIntStream = Stream.generate(() -> random.nextInt(5));
        randomIntStream.forEach(System.out::println);*/


        //How do you collect elements from a stream into a Set
        System.out.println("collect elements from a stream into a Set");
        Arrays.stream(arr).boxed().collect(Collectors.toSet()).forEach(e-> System.out.println(e));

        //How do you transform a list of strings to uppercase using streams
        System.out.println("transform a list of strings to uppercase using streams");
        List<String> list1 = Arrays.asList("nikita","sneha","ruchita");
        list1.stream().map(n->n.toUpperCase()).forEach(e-> System.out.println(e));
    }
}