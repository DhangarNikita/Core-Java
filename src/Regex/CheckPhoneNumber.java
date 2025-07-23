package Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckPhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Number");
        String str = sc.nextLine();

       boolean b =  Pattern.matches("^\\+91\\d{10}$",str);
        System.out.println(b);


    }
}
