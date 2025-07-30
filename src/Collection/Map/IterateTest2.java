package collection.Map;

import java.util.HashMap;
import java.util.Map;
//Iterating over Keys or Values using keySet() and value() Methods
public class IterateTest2 {
    public static void main(String[] args){
        Map<Integer,String> map= new HashMap<>();
        map.put(101,"Sneha");
        map.put(104,"Trisha");
        map.put(102,"Nikita");
        map.put(103,"Ruchita");
        map.put(105,"Shravani");
        map.put(105,"Siya");
        System.out.println("Entries in Map: " +map);

        for(Integer num :map.keySet()){
            System.out.println(num);
        }
        for(String str:map.values()){
            System.out.println(str);
        }

        // Iterating Map using Map.Entry<K,V> Method

        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
