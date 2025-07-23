package Practice;

// Write a program to print the ASCII values
public class PrintAscii {
    public static void main(String[] args) {
        System.out.println("Character ASCII Value");
        for (int i = 0; i <= 127; i++) {
            System.out.println((char) i + "\t" + i);
        }
    }
}