package ArrayProgramming;
import java.util.Scanner;
//Ask the user for a number n, then print the sum of all numbers from 1 to n.
public class Sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sum=0;
        for(int i= 1; i<=n; i++){
            sum+=i;
        }
        System.out.println("sum of "+ n +" Number is " +sum);
    }
}
