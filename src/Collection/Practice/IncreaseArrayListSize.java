package collection.practice;

//20. Write a Java program to increase an array list size.
// basically arraylist is dynamic its nature is growing nature but using ensureCapacity() we can increase size

import java.util.ArrayList;

public class IncreaseArrayListSize {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>(5);
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println(list.size());
        list.ensureCapacity(8);
        list.add("F");
        list.add("G");
        list.add("H");
        System.out.println(list.size());

    }


}
