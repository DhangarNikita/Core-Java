package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class AlphaPattern {
    public static void checkRegex(String reg, String input) {
        Boolean b = Pattern.matches(reg, input);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter TYour Regex expression");
            String str = sc.nextLine();

            System.out.println("Enter your input");
            String s = sc.nextLine();

            checkRegex(str, s);
            System.out.println("Do you want to exit [Y/N]");
            String choice = sc.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                System.out.println("Thank you.....The end");
                break;
            }
        }

    }
}
