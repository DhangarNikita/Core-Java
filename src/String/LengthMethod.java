package String;

//The number of characters in a string is called length of a string. To get this value, call length() method.

public class LengthMethod {
    public static void main(String[] args) {
        String s2 ="Java";
        System.out.println(s2.length());

        String s3 =" Jav@_a ";
        System.out.println(s3.length());

        String s4 = "Nikita";
        int findLen = s4.length();
        System.out.println(findLen);

        char [] arr = {'n', 'i','k','i','t','a'};
        String s5 = new String(arr);
        System.out.println(s5.length());
    }
}
