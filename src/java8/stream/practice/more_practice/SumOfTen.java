package java8.stream.practice.more_practice;
//19) How do you find sum of first 10 natural numbers

import java.util.stream.IntStream;

public class SumOfTen {
    public static void main(String[] args) {
        int sum = IntStream.range(1,11).sum();
        System.out.println("Sum of first 10 number is : "+sum);

    }
}
