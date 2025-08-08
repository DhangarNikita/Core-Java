package collection.practice;

import java.util.ArrayList;
import java.util.Iterator;

//1.Write a Java program to create an array list, add some colors (strings) and print out the collection.
public class Colors {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Red");
        list.add("Pink");
        list.add("Orange");
        list.add("Black");
        list.add("White");
        list.add("Green");
        System.out.println("List of colors: "+list);

        //2. Write a Java program to iterate through all elements in an array list.
        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            String str=itr.next();
            System.out.print(str+" ");
        }
    }
}
