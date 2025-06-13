package String.Methods;
//It replaces all the old char or CharSequence to new char or CharSequence

public class ReplaceMethod {
    public static void main(String[] args){
        String s1 = "Java";
        String s2 = s1.replace('J','a');
        System.out.println(s2);
        System.out.println(s1.replace('a','i'));

        String str = "Programming";
        String s11 = str.replace("Programming", "nikita");
        System.out.println("Programming to "+s11);
    }
}
