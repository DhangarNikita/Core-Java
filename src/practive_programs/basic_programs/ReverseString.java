package practive_programs.basic_programs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // String str ="java is programming languge";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String : ");
        String str = sc.nextLine();
        String[] news = str.split(" ");
        String result = "";
        for (String Word : news) {
            if (Word.length() <= 2) {
                result += Word + " ";

            } else {
                char first = Word.charAt(0);
                char last = Word.charAt(Word.length() - 1);
                String middle = "";

                for (int i = Word.length() - 2; i > 0; i--) {
                    middle = middle + Word.charAt(i);
                }
                result = result + first + middle + last + " ";
            }
        }
        System.out.println(result);
    }
}