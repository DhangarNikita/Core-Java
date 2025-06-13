package String.Methods;

public class HashCodeMethod {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");

        String s3 = "Java";
        String s4 = "Java";

        System.out.println(s1.hashCode());
        System.out.println(s4.hashCode());


    }


}
