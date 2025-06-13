package String.Methods;
//  isEmpty(): This method is used to check that the string is empty or not

public class IsEmptyMethod {
    public static void main(String[] args) {

        String s1 ="";
        String s2 ="Java";
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());

        String str = ""; // Empty string.
        boolean isEmpty1 = str.isEmpty();
        System.out.println("Is String empty: " +isEmpty1);

        String str2 = " ";
        boolean isEmpty2 = str2.isEmpty();
        System.out.println("Is String empty: " +isEmpty2);

    }
}
