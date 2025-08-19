package java8.lambda_expression;

//Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.

import java.util.ArrayList;
import java.util.List;

interface MultiSum {
    void result(List<Integer> list);
}

public class MulSum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(100);
        list.add(9);
        list.add(25);

        MultiSum ms = (List<Integer> list1) -> {
            int sum = 0;
            int mul = 1;
            if (list1.isEmpty()) {
                System.out.println("list is empty");
            } else {
                for (Integer count : list1) {
                    sum += count;
                    mul *= count;
                }
                System.out.println("Sum of list is : " + sum);
                System.out.println("Multiplication of list is : " + mul);
            }
        };

        ms.result(list);
    }

}
