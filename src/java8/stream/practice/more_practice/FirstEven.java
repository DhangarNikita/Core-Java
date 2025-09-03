package java8.stream.practice.more_practice;
//21) Print first 10 even numbers

import java.util.stream.IntStream;

public class FirstEven {
    public static void main(String[] args) {
        IntStream.range(1,11).map(i -> i*2).forEach(e-> System.out.println(e));
        //or
        IntStream.rangeClosed(1,20).filter(i -> i%2==0).forEach(e-> System.out.println(e));

    }
}
