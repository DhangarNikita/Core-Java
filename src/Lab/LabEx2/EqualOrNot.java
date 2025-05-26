package Lab.LabEx2;
import java.util.Scanner;

//Write program to print given numbers are equal or not.
public class EqualOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        if(a==b){
            System.out.println(a +" And "+ b +" are equal");
        }else{
            System.out.println(a +" And "+ b +" are not equal");
        }
    }
}