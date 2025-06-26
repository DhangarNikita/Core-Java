package Exception.CompileTime;

/*import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;*/
import java.io.*;
//FileNotFoundException

public class FileReadDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\Lenovo\\Desktop\\FileCodeDemo.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println(br.readLine());
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please check the file name.");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}
