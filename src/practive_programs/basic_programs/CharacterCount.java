package practive_programs.basic_programs;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String");
        String str = sc.nextLine();
        str = str.toLowerCase();

        boolean[] b = new boolean[str.length()];
        boolean visited = false;

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (b[i] == true || str.charAt(i) == ' ') {
                continue;
            }

            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    b[j] = true;
                }
            }
            System.out.println("Charater " + str.charAt(i) + " occurred " + count + " times");
        }


    }
}
