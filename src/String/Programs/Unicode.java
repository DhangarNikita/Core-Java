package string.programs;


import java.util.Scanner;

public class Unicode {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println("Enter Inder");
        int n = sc.nextInt();

        int result = str.codePointAt(n);
        System.out.println("Codepoint At index "+n+" is: "+result);
        int before = str.codePointBefore(n);
        System.out.println("Codepoint before index "+n+" is: "+before);
        int range = str.codePointCount(1,5);
        System.out.println(range);


    }
}
