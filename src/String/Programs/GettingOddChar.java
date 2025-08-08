package string.programs;

import java.util.Scanner;

public class GettingOddChar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String");
        String s1 = sc.nextLine();
        int positiveCount=0;
        int negativeCount =0;

        for(int i=0; i<s1.length();i++){
            if(i%2 ==0){
                positiveCount++;
                //System.out.println("Char at " +i+ " place " +s1.charAt(i));

            }
            else{
                negativeCount++;
               // System.out.println("Char at " +i+ " place " +s1.charAt(i));

            }
        }
        System.out.println("Positive Count is: "+positiveCount);
        System.out.println("Negative Count is: "+negativeCount);
    }
}
