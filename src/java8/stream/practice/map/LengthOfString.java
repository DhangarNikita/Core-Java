package java8.stream.practice.map;

//Given a list of strings, map them to their lengths.
import java.util.Arrays;
import java.util.List;

public class LengthOfString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "kiwi");
        list.stream().map(list1->list1.length()).forEach(e-> System.out.println(e));
    }
}
