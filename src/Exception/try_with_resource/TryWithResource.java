package exception.try_with_resource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("Demo.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("No file found");
            e.printStackTrace(); // Fixed typo here
        }
    }
}
