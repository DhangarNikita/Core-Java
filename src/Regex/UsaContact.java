package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UsaContact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Number");
        String str = sc.nextLine();

        boolean b = Pattern.matches("^(\\([0-9]{3}\\) |[0-9]{3}-)[0-9]{3}-[0-9]{4}$", str);
        System.out.println(b);
    }
}
