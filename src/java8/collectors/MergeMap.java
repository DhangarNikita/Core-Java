package java8.collectors;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//How do you merge two maps using streams
public class MergeMap {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 10, "B", 20, "C", 30);
        Map<String, Integer> map2 = Map.of("B", 50, "D", 40);

        Map<String, Integer> merge = Stream.concat(map1.entrySet().stream(),map2.entrySet().stream()).collect(Collectors.toMap(n->n.getKey(),m->m.getValue(),(v1,v2)->v2));
        System.out.println(merge);
    }
}
