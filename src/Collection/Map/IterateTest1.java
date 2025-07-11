package Collection.Map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class IterateTest1 {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<>();
        map.put(101,"Sneha");
        map.put(104,"Trisha");
        map.put(102,"Nikita");
        map.put(103,"Ruchita");
        map.put(105,"Shravani");
        map.put(105,"Siya");
        System.out.println("Entries in Map: " +map);

        // Iterating map using Iterator.
// entrySet is a method that is used to get view of entries of a map.
        Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();
        System.out.println("Iterating Entries of Map");
        while(itr.hasNext())
        {
            Object key = itr.next();
            System.out.println(key);
        }
// keySet is a method that is used to get view of keys of a map
        Iterator<Integer> itr2 = map.keySet().iterator();
        System.out.println("Iterating Keys of Map");
        while(itr2.hasNext())
        {
            Object keyView = itr2.next();
            System.out.println(keyView);
        }
// values is a method that is used to get values of keys of a map.
        Iterator<String> itr3 = map.values().iterator();
        System.out.println("Iterating Values of Map");
        while(itr3.hasNext())
        {
            Object valuesView = itr3.next();
            System.out.println(valuesView);
        }
        // remove
        itr3.remove();
        System.out.println(map);

    }
}


