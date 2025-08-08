package exception.compile_time;
import java.io.*;
//IOException
public class FileWriteDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("output.txt");
            fw.write("Hello, this is a test.");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
    }
}
