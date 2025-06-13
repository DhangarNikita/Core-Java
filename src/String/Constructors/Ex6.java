package String.Constructors;
//This constructor create a new string object by passing byte array and index and decode
// it to ASCII value using the systems default character set
public class Ex6 {
    public static void main(String[] args) {
        byte b[]={65,66,67,68,69,70};
        String s = new String(b,2,4);  // start index and count
        System.out.println(s);
    }
}
