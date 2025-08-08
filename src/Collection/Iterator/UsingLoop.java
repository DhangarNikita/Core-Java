package collection.iterator;
import java.util.*;
public class UsingLoop {
    public static void main(String[] args){

    List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        int a= list.size();

//Iterate ArrayList in Java using for loop
        for(int i=0;i<a;i++){
            String str =list.get(i);
            System.out.println(str);
        }

//Iterating ArrayList using Enhanced or Advanced for loop
        for(String st :list){
            System.out.println(st);
        }

        //Iterating ArrayList using While loop
        int i=0;
        while(list.size()>i){
            System.out.println(list.get(i));
            i++;
        }
}
}
