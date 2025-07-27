package Practice;
//Write a program to check whether a number is a Strong Number or not
import java.util.Scanner;

public class StrongNumber {

    static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += StrongNumber.fact(digit);
            n /= 10;
        }
        System.out.println("Sum of factorial number is : " + sum);
        if (original == sum) {
            System.out.println(original + " is strong number");
        }
    }
}
