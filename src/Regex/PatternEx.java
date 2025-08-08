package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternEx {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("ab");
        Matcher matcher = pattern.matcher("ab");
        boolean b = matcher.matches();
        System.out.println("result 1 : " + b);

        Pattern pattern1 = Pattern.compile("a*b");
        Matcher matches1 = pattern1.matcher("aab");
        boolean b1 = matches1.matches();
        System.out.println("result 2 : " + b1);

        Pattern pattern2 = Pattern.compile("b*a");
        Matcher matches2 = pattern2.matcher("bbba");
        boolean b2 = matches2.matches();
        System.out.println("result 3 : " + b2);

        boolean b3 = Pattern.matches("a*b*", "aaaaabbbbb");
        System.out.println("result 4 : " + b3);

        boolean b4 = Pattern.matches("a*b*c", "aaaaabbbbbc");
        System.out.println("result 5 : " + b4);

        boolean b5 = Pattern.matches("a*", ""); //a, zero or more times
        System.out.println("result 6 : " + b5);

        boolean b6 = Pattern.matches("y*", "yyy"); //y, zero or more times
        System.out.println("result 7 : " + b6);

        boolean b7 = Pattern.matches("a*b*c", "aaaabbbbc"); //a,b can be many times but c shoulb be once
        System.out.println("result 8 : " + b7);

        boolean b8 = Pattern.matches("a?", "a"); //a, once or not at all
        System.out.println("result 9 : " + b8);

        boolean b9 = Pattern.matches("A+", "A"); //a, one or more times
        System.out.println("result 10 : " + b9);

        boolean b10 = Pattern.matches("x{2}", "xx"); //a, one or more times
        System.out.println("result 11 : " + b10);


    }
}
