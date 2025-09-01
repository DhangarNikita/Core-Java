package java8.stream.practice.map;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Abbff","Bfde","Cfredfred","Dvfd");
        Map<String,Integer>map = list.stream().collect(Collectors.toMap(s->s,s->s.length()));
        //System.out.println(map);
        for(Map.Entry<String,Integer> mp:map.entrySet()){
            System.out.println("key is :"+mp.getKey()+" value is : "+mp.getValue());
        }

    }
}
