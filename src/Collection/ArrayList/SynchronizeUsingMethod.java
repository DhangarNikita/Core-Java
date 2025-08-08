package collection.arraylist;
import java.util.*;
public class SynchronizeUsingMethod {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        List<String> str=Collections.synchronizedList(list);

        synchronized(str){
            Iterator<String> itrlist =str.iterator();
            while(itrlist.hasNext()){
                System.out.println(itrlist.next());
            }
        }

    }
}
