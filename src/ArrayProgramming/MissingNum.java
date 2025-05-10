package ArrayProgramming;
import java.util.Scanner;

// find the missing number
public class MissingNum {
    int missing(int [] arr, int n){
        int expectedSum =n*(n+1)/2;
        int actualsum = 0;

        for (int i=1;i<arr.length; i++){
            actualsum = actualsum+arr[i];
        }
        return expectedSum- actualsum ;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        MissingNum ms = new MissingNum ();

        int [] arr = {1,3,4,5,6,7,8,9};
        System.out.println("Missing Number is "+ ms.missing(arr,n));
    }

}
/*
public class MissingNumber {
    public static int findMissing(int[] arr, int n) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return n; // If the last number is missing
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int n = 5;
        System.out.println("Missing number is: " + findMissing(arr, n));
    }
}
 */