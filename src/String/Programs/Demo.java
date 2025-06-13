package String.Programs;

public class Demo {
    public static void main(String[] args){
        String s1 ="Nikita Dhangar";
        String s2 ="Dhangar";
        String s3 ="example.com";
        CharSequence cs = "example.com";
        StringBuffer sb = new StringBuffer(s1);

        System.out.println(s1.contains(s2)); // true
        System.out.println(s2.contains(s1)); // false
        System.out.println(s3.contentEquals(cs)); // true
        System.out.println(s1.contentEquals(sb)); // true

        char[] arr_num = new char[] { '1', '2', '3', '4' };
        String str = String.copyValueOf(arr_num, 1, 3); // index 1 to 3
        System.out.println(str);

        String end_str = "ar";
        System.out.println(s2.endsWith(end_str));
        System.out.println(s2.startsWith(end_str));
        char c = 'd';
        System.out.println('d');

    }
}
