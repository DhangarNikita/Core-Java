package collection.Practice;
//7. Write a Java program to search for an element in an array list.

import java.util.ArrayList;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Nikita");
        list.add("Sneha");
        list.add("Ruchita");
        list.add("Trisha");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element");
        String str= sc.nextLine();

        boolean flag =false;

        for(int i=0;i<list.size();i++){
            if(list.get(i).equalsIgnoreCase(str)){
                flag=true;
                System.out.println("Element Found: "+list.get(i));
            }
        }
        if(flag!=true){
            System.out.println("Element is missing");
        }
        sc.close();


    }
}
