package collection.iterator;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorMethods {
    public static void main(String[] args){
        ArrayList<String> list =new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list);

        ListIterator<String> listitr = list.listIterator();

        //forward Direction
        while(listitr.hasNext()){
            int i = listitr.nextIndex();
            String str = listitr.next();
            System.out.println(i+" "+ str);
        }
        System.out.println();

        // revers Direction
        while(listitr.hasPrevious()){
            int i = listitr.previousIndex();
            String st = listitr.previous();
            System.out.println(i+" " +st);
        }

    }
}
