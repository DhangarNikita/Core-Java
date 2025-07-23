package practive_programs.regex;
//1) Character Count
//2) Special Character Count
//3) Number Count

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterCount {
    public static void main(String[] args) {
        String s1 = "Java Programs123$ test@gmail.com";

       /* Pattern charPattern = Pattern.compile("[a-zA-Z]");
        Matcher cm = charPattern.matcher(s1);
        int charCount = 0;
        while (cm.find()) {
            charCount++;
        }*/

        Pattern p = Pattern.compile("[a-zA-Z]");
        Matcher m = p.matcher(s1);
        int charcount=0;
        while(m.find()){
            charcount++;
        }

        Pattern p1 = Pattern.compile("\\d");
        Matcher m1 =p1.matcher(s1);
        int digitCount =0;
        while(m1.find()){
            digitCount++;
        }

        Pattern p3 = Pattern.compile("[^  a-zA-Z0-9\\s]");
        Matcher m3 = p3.matcher(s1);
        int specialCount=0;
        while(m3.find()){
            specialCount++;
        }

        System.out.println("Character Count Is : "+charcount);
        System.out.println("Digit Count Is : "+digitCount);
        System.out.println("Special Character Count Is :  "+specialCount);

    }
}
