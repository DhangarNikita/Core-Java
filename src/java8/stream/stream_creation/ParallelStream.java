package java8.stream.stream_creation;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","B","C","D");
        list.stream().forEach(System.out::print);
        System.out.println();
        list.parallelStream().forEach(System.out::print);
        System.out.println();
        list.parallelStream().forEachOrdered(System.out::print);
    }
}
