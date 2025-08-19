package java8.lambda_expression;
//Write a Java program to implement a lambda expression to check if a given string is a palindrome.

import java.util.Scanner;

interface StringPalindrome{
    String palindrome(String str);
}

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = sc.nextLine();


        StringPalindrome sp = (String st)->{
            String original=st;
            String result="";
            for(int i=st.length()-1;i>=0;i--){
                result+=st.charAt(i);
            }
            System.out.println(result);

            if(original.equals(result)){
                System.out.println("String is palindrome");
            }else{
                System.out.println("String is not a palindrome");
            }
            return result;
        };

        sp.palindrome(str);


    }
}
