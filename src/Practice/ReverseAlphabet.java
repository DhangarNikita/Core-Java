package Practice;
//Write a program to print reverse alphabets from Z to A

public class ReverseAlphabet {
    public static void main(String[] args) {

        System.out.println("Reverse alphabets are");

        for (char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.println(ch);
        }

    }
}
