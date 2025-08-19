package java8.lambda_expression;
//Write a Java program to implement a lambda expression to create a lambda expression to check if a number is prime.

interface PrimeNumber {
    void prime(int n);

}

public class Prime {
    public static void main(String[] args) {
        PrimeNumber pn = (int n) -> {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count > 2) {
                System.out.println(n + " Number is not a prime number");
            } else {
                System.out.println(n + " Number is prime");
            }

        };

        pn.prime(10);
    }
}
