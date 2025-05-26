package Lab.LabEx2;
import java.util.Scanner;

//Write program to print the even numbers between two numbers order may be increment or decrement?
public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();
        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even number");
                }
            }

        } else {
            for (int i = a; i >= b; i--) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                }
            }

        }
    }
}
