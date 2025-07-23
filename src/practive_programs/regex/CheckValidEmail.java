package practive_programs.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckValidEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Email Id");
        String str = sc.nextLine();
       // boolean b = Pattern.matches("^[a-zA-z0-9_.$-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$",str);
        boolean b = Pattern.matches("^[\\w.$-]+@[\\w.-]+\\.[a-zA-Z]{2,}$",str);// "^[\\w.$-]+@[\\w.-]+\\.[a-zA-Z]{2,}$"

        if(b){
            System.out.println("Valid Email");
        }else{
            System.out.println("Email is invalid");
        }
    }
}
