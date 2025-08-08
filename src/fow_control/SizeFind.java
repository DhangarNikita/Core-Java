package fow_control;
import java.util.Scanner;
/*
Write a program using if else if
xxl=48
xl=46
l=42-44
M= 40-42
S= 36-40
XS= 30-36
*/

public class SizeFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int size =sc.nextInt();

        if(size>=48){
            System.out.println(size+" XXl");
        }else if(size>=46 && size<48){
            System.out.print("Xl "+size);
        }else if(size>=42 && size<44){
            System.out.print("L "+size);
        }else if(size >=40 && size <42){
            System.out.print("M "+size);
        }else if(size>=36 && size< 40){
            System.out.print("S "+size);
        }else if(size >=30 && size <36){
            System.out.print("XS "+size);
        } else{
            System.out.print("provide Valid Size");
        }
    }

}
