package String;
// ignore upper and lower case
public class EqualsIgnoreMethod {
    public static void main(String[] args) {
        String s1 = "JAVA";
        String s2 = "java";
        String s3 = "Java ";

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));  // space contain and lower case
    }
}
