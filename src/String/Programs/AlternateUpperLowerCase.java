package string.programs;
// convert characters in a string to alternating upper and lower cases

public class AlternateUpperLowerCase {
    public static void main(String[] args) {
        String s= "nikita dhangar";
        String s1 ="";

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (i % 2 == 0) {

                s1+=Character.toUpperCase(c);
            }
            else{
                s1+=Character.toLowerCase(c);
            }
        }
        System.out.println(s1);
    }
}
