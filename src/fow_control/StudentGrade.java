package fow_control;
import java.util.Scanner;
/*
Write a program that takes a student's score (0–100) as input and prints their grade:
90–100: A
80–89: B
70–79: C
60–69: D
Below 60: F
*/
public class StudentGrade {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Score");
        int a = sc.nextInt();

        if(a>=90 && a<=100){
            System.out.print("A Grade "+a);
        }else if(a>=80 && a<=89){
            System.out.print("B Grade "+a);
        }else if(a>=70 && a<=79){
            System.out.print("C Grade "+a);
        }else if(a>= 60 && a<=69){
            System.out.print("D Grade "+a);
        }else{
            System .out.print(" Fail");
        }

    }
}
