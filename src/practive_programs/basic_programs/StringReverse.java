package practive_programs.basic_programs;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Nikita Dhangar".toLowerCase();
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        System.out.println("Reverse String : " + reverse);
    }
}
