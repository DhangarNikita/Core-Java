package fow_control;
import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = sc.nextInt();

        if(a>=0){
            System.out.println("Number is positive");
        }
        System.out.println("Number is negative");
    }
}
