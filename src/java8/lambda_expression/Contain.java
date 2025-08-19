package java8.lambda_expression;
//Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.

import java.util.ArrayList;
import java.util.List;

interface ContainWord {
    boolean con(List<String> list, String str);

}

public class Contain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Nikita");
        list.add("Sneha");
        list.add("Ruchita");
        list.add("Krishika");

        ContainWord cw = (List<String> list1, String st) -> list1.contains(st);

        boolean result = cw.con(list, "Swati");
        System.out.println(result);

    }
}
