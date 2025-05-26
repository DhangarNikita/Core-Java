package String;
// equal() method check the content inside the object

public class EqualMethod {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = new String(" Java"); // space also consider

        String s4 = "Java";
        String s5 = "java";
        String s6 = "Java ";

        boolean r= s1.equals(s2);
        System.out.println(r);
        System.out.println(s1.equals(s3));  // false because space is present of s3
        System.out.println(s1.equals(s6));  // false because space is present at the end of s6
        System.out.println(s4.equals(s5));  // false because small letter is present at the s5
        System.out.println(s1.equals(s4));  // true
        System.out.println(s1.equals(null));
    }

}
