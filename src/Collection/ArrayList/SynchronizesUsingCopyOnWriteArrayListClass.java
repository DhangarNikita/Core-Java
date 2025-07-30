package collection.ArrayList;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizesUsingCopyOnWriteArrayListClass {
    public static void main(String[] args){
        CopyOnWriteArrayList <String> str =new CopyOnWriteArrayList<>();
        str.add("A");
        str.add("B");
        str.add("C");
        str.add("D");
        str.add("E");

        List<String> list =Collections.synchronizedList(str);
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
           String st =itr.next();
            System.out.println(st);
        }
        System.out.println(str);

    }
}




