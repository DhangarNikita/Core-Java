package java8.lambda_expression;

//Write a Java program to implement a lambda expression to concatenate two strings.

interface Concatenation {
    void str(String s1, String s2);
}

public class Concatenate {
    public static void main(String[] args) {
        Concatenation co = (String s1, String s2) -> {
            String result = s1.concat(s2);
            String result1 = s1 + " " + s2;
            System.out.println(result);
            System.out.println(result1);

        };

        co.str("Hello", "Nikita");
    }

}
