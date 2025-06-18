package FileHandling;
import java.io.*;


public class FileWriterClass {
     public static void main(String[] args)  {

       try(FileWriter fw = new FileWriter("C:\\Users\\Lenovo\\Desktop\\FileCodeDemo.txt")){
               fw.write("Hello Java print");
               System.out.println("File created");
       } catch (IOException e) {
           e.printStackTrace();
       }


    }
}
