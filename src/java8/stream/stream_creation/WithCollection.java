package java8.stream.stream_creation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class WithCollection {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Nikita");
        list.add("Ruchita");
        list.add("Sneha");

        list.stream().forEach(System.out::println);

    }
}
