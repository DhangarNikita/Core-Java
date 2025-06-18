package Exception.RunTime;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMisMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //If we enter input as a string instead number then InputMismatchException occurs
        try{
            System.out.println("Enter First Number : ");
            int num1 = sc.nextInt();
            System.out.println("Enter Second Number : ");
            int num2 = sc.nextInt();
            System.out.println(num1 / num2);
        } catch (InputMismatchException ie) {
            ie.printStackTrace();
            System.out.println(ie.getMessage());
        }catch(ArithmeticException ae){
            ae.printStackTrace();
            System.out.println(ae.getMessage());
        }
    }
}

