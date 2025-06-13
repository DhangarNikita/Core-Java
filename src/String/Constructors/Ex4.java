package String.Constructors;
// pass char array as argument of string object with start index and count to
public class Ex4 {
    public static void main(String[] args) {
        char c []={'n','i','k','i','t','a'};
        String s = new String(c,1,5);
        System.out.println(s);
    }
}
