package String.Constructors;
// pass byte array as a argument of a string object

public class Ex5 {
    public static void main(String[] args) {
        byte[]b ={65,66,67,68,69,70};
        String s = new String(b);
        System.out.println(s);

    }
}
