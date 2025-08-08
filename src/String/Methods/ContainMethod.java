package string.methods;

// This method returns true if this string contains the specified sequence of char value.
public class ContainMethod {
    public static void main(String[] args) {
        String s1 = "Nikita dhangar";
        System.out.println(s1.contains("nikita"));  // false (upper case not match)
        System.out.println(s1.contains("dhangar"));  // true

        String str = new String("I love Java");
        boolean str2 = str.contains("Love");
        boolean str3 = str.contains("Java");
        System.out.println("str2: " +str2);
        System.out.println("str3: " +str3);

    }
}
