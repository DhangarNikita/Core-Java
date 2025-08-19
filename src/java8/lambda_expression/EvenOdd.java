package java8.lambda_expression;
//Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.

import java.util.ArrayList;
import java.util.List;

interface Test {
    boolean test(int a);
}

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(27);
        list.add(30);
        list.add(40);
        list.add(50);


        Test even = (n) -> n % 2 == 0;
        Test odd = (n) -> n % 2 != 0;

        for (int num : list) {
            if (even.test(num)) {
                System.out.println(num);
            }
        }

        System.out.println("========================================");

        for (int num : list) {
            if (odd.test(num)) {
                System.out.println(num);
            }
        }
    }

}
