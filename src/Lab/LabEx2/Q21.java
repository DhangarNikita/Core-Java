package lab.labEx2;

public class Q21 {
    public static void main(String[] args) {
    int n = 5;  // Total number of rows

        for (int i = 1; i <= n; i++) {
        // Print leading spaces
        for (int space = 1; space <= n - i; space++) {
            System.out.print("  ");  // 2 spaces for alignment
        }

        // Print increasing numbers
        for (int num = 1; num <= i; num++) {
            System.out.print(num + " ");
        }

        // Print decreasing numbers
        for (int num = i - 1; num >= 1; num--) {
            System.out.print(num + " ");
        }

        System.out.println();  // Move to next line
    }
}
}
/*
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1

 */