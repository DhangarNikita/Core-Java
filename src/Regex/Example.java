package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("ab");
        Matcher m =p.matcher("ab");
        boolean b = m.matches();
        System.out.println(b);

       // Pattern pattern = Pattern.compile("A*B");  // any number of a but end with b
        //Matcher matcher = pattern.matcher("AAB");
        boolean b1 = Pattern.matches("A*B","AAB");
        System.out.println(b1);

        boolean b2 = Pattern.matches("A*B*","AABB");
        System.out.println(b2);
    }

}
