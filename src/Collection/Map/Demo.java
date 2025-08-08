package collection.map;
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<>();
        map.put(101,"Sneha");
        map.put(104,"Trisha");
        map.put(102,"Nikita");
        map.put(103,"Ruchita");
        map.put(105,"Shravani");
        map.put(105,"Siya");
        System.out.println("Entries in Map: " +map);

        boolean isEmpty = map.isEmpty();
        System.out.println(" Is Map is empty? " +isEmpty);

        int size = map.size();
        System.out.println("No. of entries in Map: " +size);

    }
}
