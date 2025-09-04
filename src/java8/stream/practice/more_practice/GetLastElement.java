package java8.stream.practice.more_practice;
//31) How do you get last element of an array?

import java.util.Arrays;
import java.util.List;
public class GetLastElement {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
       String str = listOfStrings.stream().skip(listOfStrings.size()-1).findFirst().get();
        System.out.println("Last element is : "+ str);
    }
}
