package java8.stream.practice.more_practice;
//30) First 10 odd numbers

import java.util.stream.IntStream;

public class FirstTenOdd {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,20).filter((i)->i%2!=0).forEach(e-> System.out.println(e));

    }
}
