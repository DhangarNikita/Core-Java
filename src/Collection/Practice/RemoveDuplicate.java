package collection.practice;

import java.util.ArrayList;
import java.util.Collections;

// 25. Write a program to remove all duplicate elements from an ArrayList.
public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(10);
        list.add(50);
        System.out.println(list);

        ArrayList<Integer> intList =new ArrayList<>();
        for(Integer lists : list){
            if(!intList.contains(lists)){
                intList.add(lists);
            }
        }
        System.out.println(intList);

    }
}
