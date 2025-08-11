package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Email");
        String str = sc.nextLine();

        Pattern p = Pattern.compile("^[a-zA-Z0-9_.$-]+@[a-zA-Z0-9]+\\.[a-zA-z]{2,}$");
        Matcher m = p.matcher(str);
        boolean b = m.matches();
        if (b) {
            System.out.println("valid email id");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
