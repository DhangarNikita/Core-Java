package String.Methods;

public class CharacterAtIndex {
    public static void main(String[] args) {
        String s1 = "Nikita";
        System.out.println("Character at 1st index "+s1.charAt(1));


        String name = "OpenAI";
        int n= name.length();
        char firstChar = name.charAt(n-1);
        System.out.println("Character at index 0: " + firstChar);


        char fourthChar = name.charAt(3);
        System.out.println("Character at index 3: " + fourthChar);
    }

}
