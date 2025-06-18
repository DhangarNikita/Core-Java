package FileHandling;
import java.io.*;
public class FileInfo {
    public static void main(String[] args) throws IOException{
        File f = new File("C:\\Users\\Lenovo\\Desktop\\Codedemo.txt");
        if (f.exists()){
            System.out.println("Name of file "+f.getName());
            System.out.println("Can we write "+f.canWrite());
            System.out.println("Can we read "+f.canRead());
            System.out.println("Location "+f.getAbsolutePath());
            System.out.println("Size "+f.length());
        }else{
            System.out.println("File not exist");
        }

    }

}
