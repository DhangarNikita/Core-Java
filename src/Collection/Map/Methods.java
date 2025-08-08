package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Methods {
    public static void main(String[] args){
        Map<Integer,String> map= new HashMap<>();

        //put method
        map.put(101,"Sneha");
        map.put(102,"Nikita");
        map.put(103,"Ruchita");
        map.put(104,"Trisha");
        map.put(105,"Shravani");

        System.out.println(map);

        Map<Integer,String> map1= new HashMap<>();
        map.put(106,"Rekha");
        map.put(107,"Jyoti");
        map.put(108,"Swati");

        //putAll
        map.putAll(map1);
        System.out.println(map);

        //putIfAbsent
        map.putIfAbsent(109,"Shweta");
        System.out.println(map);

        //remove using key
        map.remove(109);
        System.out.println(map);

        //remove using key and value
        map.remove(108,"Swati");
        System.out.println(map);

        //set view
        Set<Integer> keySet = map.keySet();
        System.out.println("Key Set: " + keySet);

        //collection value
        Collection<String> values = map.values();
        System.out.println("Collection view of values: " +values);

        //clear
        //map.clear();
       // System.out.println(map);

        // get method
        System.out.println(map.get(101));

        //hashcode
        System.out.println(map1.hashCode());  // Same value
        System.out.println(map.hashCode());  // Same value

        //isEmpty
        boolean empty = map.isEmpty();
        System.out.println(empty);

        //size()
        System.out.println(map.size());

        //replace
        map.replace(102,"Siya");
        System.out.println(map);

        //replace old with new
        map.replace(103,"Ruchita","Ruchu");
        System.out.println(map);

        //containsKey
        boolean key=map.containsKey(101);
        System.out.println(key);

        // containValue
        boolean value = map.containsValue("Nikita");
        System.out.println(value);

        // equals
        System.out.println(map.equals(map1));
    }

}
