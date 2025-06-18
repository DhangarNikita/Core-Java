package Exception.CompileTime;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {
    public static void main(String[] args) {
       try{
           File fl = new File("C:\\Users\\LENOVO\\Desktop\\soql.text");
           FileReader fr = new FileReader(fl);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
    }
}
