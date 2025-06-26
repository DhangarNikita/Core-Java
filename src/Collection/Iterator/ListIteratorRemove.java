package Collection.Iterator;
import java.util.*;
public class ListIteratorRemove {
    public static void main(String[] args){
        ArrayList<String> str = new ArrayList<>();
        str.add("A");
        str.add("B");
        str.add("C");
        str.add("D");
        str.add("E");

        ListIterator<String> list =str.listIterator();

        while(list.hasNext()){
            String st = list.next();
            System.out.println(st);
        }
        list.remove();
        System.out.println(str);
    }
}
