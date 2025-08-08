package string.methods;
// break string using starting and ending index
public class SubstringMethod {
    public static void main(String[] args) {
        String str ="Hello Java";
        byte [] arr = {10, 20, 30};
        String s3 = new String(arr);
        String s1 = str.substring(0,5);
        System.out.println(s1);

        String s2 =str.substring(5);  // staring from 5th index to the till the end
        System.out.println(s2);
    }

}
