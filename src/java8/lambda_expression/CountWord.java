package java8.lambda_expression;
//Write a Java program to implement a lambda expression to count words in a sentence.

import java.util.Scanner;

interface Count{
    int word(String str);

}

public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        Count co =(str)->{
            String[] words = str.split("\\s+"); 
            int count = words.length;
            System.out.println(count);
            return count;
        };

        co.word(sentence);

    }
}
