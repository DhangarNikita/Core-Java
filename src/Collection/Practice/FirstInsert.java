package collection.practice;
//3. Write a Java program to insert an element into the array list at the first position.
import java.util.*;
public class FirstInsert {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Nikita");
        list.add("Sneha");
        list.add("Ruchita");
        list.add("Trisha");

        System.out.println("befor insert: "+ list);

        list.add(0,"Shravani");
        System.out.println("list after insert "+list);

//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        String str=list.get(3);
        System.out.println("Element at specified index: "+str);

//5.Write a Java program to update an array element by the given element.
        list.set(2,"Priya");
        System.out.println("List after Update: "+list);

//6. Write a Java program to remove the third element from an array list.
        list.remove(3);
        System.out.println("List After removing element: "+list);


    }

}
