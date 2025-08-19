package java8.lambda_expression;
//Write a Java program to implement a lambda expression to calculate the sum of all prime numbers in a given range.

import java.util.Scanner;

interface SumPrime{
    int sum(int a, int b);
}

public class PrimeSum {
     static boolean isPrime(int n){
         int count =0;
         for(int i=1;i<=n;i++){
             if(n%i==0){
                 count++;
             }
         }
         return count==2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 1st integer");
        int a = sc.nextInt();
        System.out.println("Enter your 2nd integer");
        int b = sc.nextInt();

        SumPrime sp=(num1,num2)->{
            int result=0;
            for(int i=num1;i<=num2;i++){
                if(isPrime(i)){
                    result+=i;
                }
            }
            return result;
        };

        int sumOfPrime = sp.sum(a,b);
        System.out.println("Sum of prime numbers from "+a+" to "+b+" are : "+sumOfPrime);
    }
}
