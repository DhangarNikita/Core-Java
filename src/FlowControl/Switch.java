package FlowControl;
import java.util.Scanner;
// The program takes a number (1 to 7) and prints the corresponding day name.
public class Switch {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print(" Enter a day");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Invalid input! Please enter a number from 1 to 7.");
        }

    }
}
