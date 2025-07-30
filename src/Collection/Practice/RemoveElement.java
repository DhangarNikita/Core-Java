package collection.Practice;
//6. Write a Java program to remove the third element from an array list.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index do you want to remove");
        int index = sc.nextInt();

        if(index>=0&& index<list.size()){
            System.out.println(list.remove(index));
        }

        System.out.println("list after removing a "+index +" index "+list);
    }
}
