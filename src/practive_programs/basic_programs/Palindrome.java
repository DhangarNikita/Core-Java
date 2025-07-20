package practive_programs.basic_programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String : ");

        String str = sc.nextLine();

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i) + rev;
        }

        System.out.println("Reversed String : " + rev);

        if (str.equals(rev)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
    }
}
