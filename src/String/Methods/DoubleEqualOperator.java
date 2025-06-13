package String.Methods;
// check memory address
public class DoubleEqualOperator {
    public static void main(String[] args) {

        String s1 = "java";
        String s2 = "java";
        String s3 = "Java";
        String s4 = new String("Java");
        String s5 = new String("Java");

        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s5==s4);

    }
}
