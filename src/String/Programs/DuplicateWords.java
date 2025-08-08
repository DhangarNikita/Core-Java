package string.programs;

public class DuplicateWords {
    public static void main(String[] args) {
        String s = "Java is programming language, Java just completed 30 years";

        s = s.toLowerCase(); // lower case

        String[] str = s.split("\\s+"); // split it
        boolean[] b = new boolean[str.length];

        for (int i = 0; i < str.length; i++) {
            if (b[i]==true) {
                continue;  // skip
            }

            int count = 1;
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    b[j] = true;
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(str[i]  +" " +count + " times");
            }
        }
    }
}
