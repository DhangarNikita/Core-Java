package practive_programs.basic_programs;

import java.util.Scanner;

public class DuplicateArrayElement {
    public static void main(String[] args) {

       // int[] arr = {1, 2, 1, 7, 1, 7, 9, 4};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Array Size");
        int size =sc.nextInt();

        System.out.println("Enter "+size+" Element");
        int [] arr = new int[size];
        for(int i=0; i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        boolean[] b = new boolean[arr.length];
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (b[i]==true) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    b[j] = true;
                    count++;
                }
            }
            if (count > 1) {
                found = true;
                System.out.println("Duplicate found: " + arr[i]);
            }
        }
    }
}


