package string.methods;
// convert string into unicode and return integer value
public class CompareToMethod {
    public static void main(String[] args) {
        String s1 = "mumbai";
        String s2 = "mumbai";
        String s3 = "ranchi";
        String s4 = "pune";
        String s5 = "Mumbai";
        String s6 = "";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.compareTo(s5));
        System.out.println(s1.compareTo(s6));


    }
}
