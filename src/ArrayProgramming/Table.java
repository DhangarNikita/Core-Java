package arrayprogramming;

import java.util.Scanner;
//Write a program that takes a number as input and prints its multiplication table up to 10.
public class Table {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        for(int i=1; i<=10; i++){
            int mul=num*i;
            System.out.println(num+" * "+i+" = "+ mul);
        }
    }
}
