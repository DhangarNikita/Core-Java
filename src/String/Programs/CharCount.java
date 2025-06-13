package String.Programs;

public class CharCount {
    public static void main(String[] args) {
        String str = "Nikita Dhangar";
        int count=0;
        for(int i= 0; i<str.length();i++){
            if(str.charAt(i)!= ' '){
                count++;
            }
        }
        System.out.println("Character count is: "+count);
    }
}
