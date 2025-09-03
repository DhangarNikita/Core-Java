package java8.stream.practice.more_practice;
// How do you merge two unsorted arrays into single sorted array using Java 8 streams

import java.util.Arrays;
import java.util.stream.IntStream;


public class Merge {
    public static void main(String[] args) {

        //9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?
        int[] a = new int[]{4, 2, 7, 1};
        int[] b = new int[]{8, 3, 9, 5};
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));

        //10) How do you merge two unsorted arrays into single sorted array without duplicates?
        int[] aa = new int[]{4, 2, 5, 1};
        int[] bb = new int[]{8, 1, 9, 5};
        int[] d = IntStream.concat(Arrays.stream(aa), Arrays.stream(bb)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(d));
    }
}

