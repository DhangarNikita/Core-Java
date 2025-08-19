package java8.lambda_expression;
//Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list.

import java.util.ArrayList;
import java.util.List;

interface FindEvenOddSum {
    void squareSum(List<Integer> list);
}

public class SumOddEven {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(100);
        list.add(9);
        list.add(25);

        FindEvenOddSum ss = (List<Integer> list1) -> {
            int evenSum = 0;
            int oddSum = 0;
            for (Integer num : list1) {
                int evenCount = 1;
                int oddCount = 1;
                if (num % 2 == 0) {
                    evenCount = num * num;
                    evenSum += evenCount;
                } else {
                    oddCount = num * num;
                    oddSum += oddCount;
                }
            }
            System.out.println("Sum of even square from the list is : " + evenSum);
            System.out.println("Sum of odd square from the list is : " + oddSum);

        };

        ss.squareSum(list);
    }
}
