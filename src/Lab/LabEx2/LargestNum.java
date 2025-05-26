package Lab.LabEx2;
import java.util.Scanner;

//Accept 3 numbers and find largest number using if statement only.
public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("Enter second number");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println(a +" is largest");
        }
        if(b>a && b>c){
            System.out.println(b+" is largest");
        }
        if(c>a && c>b){
            System.out.println(c+" is largest");
        }
    }
}

