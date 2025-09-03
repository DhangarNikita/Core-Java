package java8.stream.practice.more_practice;

import java.util.Arrays;

//16) Given an integer array, find sum and average of all elements?
public class ArraySumAverage {
    public static void main(String[] args) {
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        int sum = Arrays.stream(a).sum();
        System.out.println("Sum of an array is : "+sum);

        Double average = Arrays.stream(a).average().getAsDouble();
        System.out.println("Average of array : "+average);

    }
}
