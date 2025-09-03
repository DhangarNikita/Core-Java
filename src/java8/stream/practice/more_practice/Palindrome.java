package java8.stream.practice.more_practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Palindrome {
    public static void main(String[] args) {
        String str = "nikita";

        String s1 = Arrays.stream(str.split(" ")).map(st->new StringBuffer(st).reverse()).collect(Collectors.joining(" "));
        if(s1.equals(str)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not a palindrome");
        }

    }
}
