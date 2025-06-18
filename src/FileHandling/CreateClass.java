package FileHandling;

import java.io.*;
import java.io.IOException;

public class CreateClass {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\LENOVO\\Desktop\\Codedemo.txt");
        if(f.createNewFile()){
            System.out.println("File created");
        }else{
            System.out.println("File already exist");
        }

    }
}
