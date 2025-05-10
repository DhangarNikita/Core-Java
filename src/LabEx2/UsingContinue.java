package LabEx2;
// Write program to continue statement in for loop
//prints numbers from 1 to 10, but skips even numbers using continue
public class UsingContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // Skip even numbers
            if (i % 2 == 0) {
                continue; // Skip the rest of the loop for this iteration
            }
            System.out.println("Odd Number: " + i);
        }
    }
}

