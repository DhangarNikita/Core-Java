package ArrayProgramming;
/*
Given an array of integers, find all the duplicate elements in the array.
From these duplicate elements, identify the element  with the greatest value.
 */
public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 7, 1, 7, 9, 4};
        boolean[] b = new boolean[arr.length];
        int maxDuplicate = 0;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (b[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    b[j] = true; // Mark duplicate as visited
                    count++;
                }
            }

            if (count > 1) {
                found = true;
                System.out.println("Duplicate found: " + arr[i]);
                if (arr[i] > maxDuplicate) {
                    maxDuplicate = arr[i];
                }
            }
        }

        if (found) {
            System.out.println("Maximum duplicate value: " + maxDuplicate);
        } else {
            System.out.println("No duplicates found.");
        }
    }
}
