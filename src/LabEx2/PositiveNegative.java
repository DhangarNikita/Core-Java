package LabEx2;
import java.util.Scanner;
// Write program to print if a given number is positive or negative.

public class PositiveNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int n = sc.nextInt();

        if(n>=0){
            System.out.println(n +" Number is positive");
        }else{
            System.out.println(n +" Number is negative");
        }
    }
}
