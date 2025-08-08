package practice;
import java.util.Scanner;
//write a program to Check Whether a Given Number is Prime or Not
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int count = 0;
        if (n == 1) {
            System.out.println(n + " Number is not a prime number");
        } else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                System.out.println(n + " Number is prime");
            } else {
                System.out.println(n + " Number is not a prime number");
            }
        }
    }
}
