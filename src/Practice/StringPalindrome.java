package Practice;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str= sc.nextLine();
        String reverse="";


        for(int i=str.length()-1;i>=0; i--){
            reverse+=str.charAt(i);
        }
        if(str.equalsIgnoreCase(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not");
        }
    }
}
