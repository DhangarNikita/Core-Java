package java8.lambda_expression;
//Write a Java program to implement a lambda expression to find the sum of two integers

@FunctionalInterface
interface SumNumber{
    int sum(int a,int b);
    }

public class SumDemo {
    public static void main(String[] args) {
        SumNumber sm =(int a, int b)->{
            int c=a+b;
            System.out.println(c);
            return c;
        };
        sm.sum(10,20);
    }
}
