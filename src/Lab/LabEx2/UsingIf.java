package Lab.LabEx2;
import java.util.Scanner;
//check if someone is eligible to vote
public class UsingIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age");
        int age = sc.nextInt();

        if(age>= 18){
            System.out.println("You are eligible for vote ");
        }
        if(age <18){
            System.out.println("Sorry You are not eligible for vote");
        }
    }
}
