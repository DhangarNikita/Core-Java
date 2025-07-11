package ArrayProgramming;

import java.util.Scanner;

/*
Write a program to Print the Sum of Odd indexed Element and Sum of Even indexed Element in an array.
Where you have to take Size input & Elements input from the User.
 */
public class SumOfEvenOddIndex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter size of an array");
        int n =sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter "+n+" Element");
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        int evenSum =0;
        int oddSum= 0;

        for(int i=0;i<arr.length; i++){
            if(i%2==0){
               evenSum= arr[i]+evenSum;
            }
            else{
                oddSum=arr[i]+oddSum;
            }
        }

        System.out.println("Sum of Even index is "+evenSum);
        System.out.println("Sum of odd index is "+oddSum);
    }
}
