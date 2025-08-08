package collection.practice;
//8. Write a Java program to sort a given array list.
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(10);
        list.add(90);
        list.add(80);
        list.add(60);
        System.out.println(list);

        int temp=0;
        for(int i =0; i< list.size();i++){
            for(int j =i; j< list.size();j++){
                if(list.get(i)>list.get(j)){
                    temp= list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }

            }
        }
        System.out.println(list);
    }
}

class Sort{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(10);
        list.add(90);
        list.add(80);
        list.add(60);

        System.out.println(list);
        Collections.sort(list);
        System.out.println("Using Collection"+list);
    }
}