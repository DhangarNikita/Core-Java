package String;
// connect two strings
public class ConcatMethod {
    public static void main(String[] args) {
        String s1 ="Java";
        String s2 ="Programming";
        String s3 =s1.concat("Core");
        String s4= s1.concat(s2);
        System.out.println(s3+" "+s4);

        s1.concat("basics");  // we not assign any reference variable to it.
        System.out.println(s1);  // java

        // using + operator
        String s5 = "core"+"java";
        System.out.println(s5);

        String s6 = "core"+" "+"java";
        System.out.println(s6);

        // using different data type
        int age = 16;
        String s7 = "She is " + age + " years old.";
        System.out.println(s7);

        int date = 15;
        String month = " August ";
        int year = 1947;

        String s8 = date + month + year;
        System.out.println(s8); // 15 August 1947
    }
}
