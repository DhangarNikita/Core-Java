package exception.try_with_resource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TryWithDemoScanner {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Desktop\\FileCodeDemo.txt")))){
            while(sc.hasNext()){
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not Found");
            e.printStackTrace();

        }
    }
}
