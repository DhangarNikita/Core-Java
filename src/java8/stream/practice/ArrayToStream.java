package java8.stream.practice;

import java.util.Arrays;

public class ArrayToStream {
    public static void main(String[] args) {
        String [] arr={"A","B","C"};
       boolean b =  Arrays.stream(arr).anyMatch(s -> s.equals("Z"));
        System.out.println(b);
    }
}
