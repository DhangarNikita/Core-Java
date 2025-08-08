package collection.iterator;
import java.util.*;
public class ListIteratorOtherMethods {
    public static void main(String[] args){
        ArrayList<String> strlist = new ArrayList<>();

        strlist.add("A");
        strlist.add("B");
        strlist.add("C");
        strlist.add("D");
        strlist.add("E");

        ListIterator<String> liststr = strlist.listIterator();

        while (liststr.hasNext()) {

            System.out.println(liststr.next());
        }

        // set at last means replace last element
        liststr.set("H");
        System.out.println(strlist);

        //add at last
        liststr.add("P");
        System.out.println(strlist);

    }
}
