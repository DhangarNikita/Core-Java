package string.methods;

public class StartAndEndWith {
    public static void main(String[] args) {
        String s1 = "Nikita dhangar";
        String s2= "nikita";

        boolean strr =s1.startsWith(s2);
        System.out.println(strr);

        boolean strr1 = s1.endsWith(s2);
        System.out.println(strr1);

        boolean str = s1.startsWith("n");
        System.out.println(str);

        boolean str1 = s1.endsWith("r");
        System.out.println(str1);

    }
}
