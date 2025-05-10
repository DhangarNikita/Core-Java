package LabEx2;

public class PrintSamePattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");  // print i so far j is less than or equal to i
            }
            System.out.println();
        }
    }
}

/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
 */