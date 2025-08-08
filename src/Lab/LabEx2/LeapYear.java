package lab.labEx2;
import java.util.Scanner;

//Write program to check whether a year is leap or not?
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year");
        int year = sc.nextInt();

        // Leap year check
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

