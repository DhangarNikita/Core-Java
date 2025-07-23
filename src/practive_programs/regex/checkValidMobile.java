package practive_programs.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class checkValidMobile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        String str = sc.nextLine();

        boolean b = Pattern.matches("^\\+91\\d{10}$",str);
        if(b){
            System.out.println("Valid Phone Number");
        }else{
            System.out.println("Invalid Phone number");
        }

    }
}
