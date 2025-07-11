package String.Programs;
// replace string with number

public class ReplaceStringWithNumber {
    public static void main(String[] args) {
        String input = "pune mumbai Delhi pune";

        // Replace specific words with numbers
        String output = input
                .replaceAll("pune", "1")
                .replaceAll("mumbai", "2")
                .replaceAll("Delhi", "3");

        // Print the result
        System.out.println("Original String: " + input);
        System.out.println("Replaced String: " + output);
    }
}

