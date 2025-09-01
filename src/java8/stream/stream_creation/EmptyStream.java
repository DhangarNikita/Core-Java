package java8.stream.stream_creation;

import java.util.stream.Stream;

public class EmptyStream {
    public static void main(String[] args) {
        Stream<Integer> emptyStream =Stream.empty();
        System.out.println(emptyStream.count());
    }
}
