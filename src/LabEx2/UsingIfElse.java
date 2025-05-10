package LabEx2;
import java.util.Scanner;

//if and else blocks to check whether a number is even or odd

public class UsingIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age");
        int num = sc.nextInt();

        if(num % 2==0){
            System.out.println(num +" is Even number");
        }else{
            System.out.println(num +" Is odd number");
        }

    }
}
