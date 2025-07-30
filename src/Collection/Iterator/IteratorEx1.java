package collection.Iterator;

import java.util.*;

public class IteratorEx1 {
    public static void main(String[] args){
        List<String> list =new ArrayList<>();
        list.add("Nikita");
        list.add("Ruchita");
        list.add("Sneha");
        list.add("Trisha");
        list.add("Shravani");

        System.out.println(list);

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            String str=itr.next();
            System.out.print(str+",");
        }

    }
}
