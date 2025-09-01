package java8.stream.stream_creation;

import java.util.stream.Stream;

public class StreamBuilder {
    public static void main(String[] args) {
        Stream<String> stream = Stream.<String>builder()
                .add("A")
                .add("B")
                .add("C")
                .build();
        stream.forEach(e-> System.out.println(e));
    }
}
