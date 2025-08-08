package fow_control;

import java.util.Scanner;

/*
0–12: Child
13–19: Teenager
20–59: Adult
60 and above: Senior
*/
public class UsingIfElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age>=0&& age<=12){
            System.out.println("Child");
        }else if(age>=13&& age<=19){
            System.out.println("Teenager");

        } else if (age>=20&& age<=59) {
            System.out.println("Adult");
        }else{
            System.out.println("Senior");
        }
    }
}
