package Demo;

public class Reverse {
    public static void main(String[] args) {
        String str = "Ava";
        String result="";
        for(int i=str.length()-1; i>=0;i--){
            result+=str.charAt(i);
        }
        System.out.println(result);
        if(str.equalsIgnoreCase(result)){
            System.out.println("string is palindrome");
        }else{
            System.out.println("String is not a palindrome");
        }
    }
}
