package java8.lambda_expression;
//Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.


interface CalculateFactorial {
    int fact(int a);

}

public class Factorial {
    public static void main(String[] args) {
        CalculateFactorial cf = (int n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            System.out.println(result);
            return result;
        };

        cf.fact(5);
    }
}
