package Lab.LabEx2;
import java.util.Scanner;
//Write Program to read 2 numbers and print biggest number?(Using Scanner)

public class BiggerNum {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();

        System.out.println("Enter second number");
        int b = sc.nextInt();

        if(a>b){
            System.out.println(a +" is biggest ");
        }else{
            System.out.println(b +" is biggest ");
        }
    }
}
