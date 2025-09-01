package java8.stream.stream_creation;

import java.util.stream.Stream;

public class WithValueStream {
    public static void main(String[] args) {
        Stream <String>valueStream=Stream.of("Nikita","Ruchita");
        long a = valueStream.count();
        System.out.println(a);

    }
}
