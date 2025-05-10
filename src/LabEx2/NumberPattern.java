package LabEx2;
/*
Write program to print
    1
    1  2
    1  2  3
    1  2  3 4

 */
public class NumberPattern {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) { //outer loop
            for (int j = 1; j <= i; j++) {  // inner loop
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}

