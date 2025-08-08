package string.programs;

public class FindUpperCaseInString {
    public static void main(String[] args) {

        String s = "Nikita Dhangar";
        String a = "";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == Character.toUpperCase(ch)) {
                a += ch;
            }
        }
        System.out.println(a);
    }
}
