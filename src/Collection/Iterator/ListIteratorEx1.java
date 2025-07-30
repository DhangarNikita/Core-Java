package collection.Iterator;
import java.util.*;
public class ListIteratorEx1 {
    public static void main(String[] args){
        ArrayList<Integer> arrlist = new ArrayList<>();
        for(int i =0; i<=10;i++){
            arrlist.add(i);
        }
        System.out.println(arrlist);
        ListIterator<Integer> listitr =arrlist.listIterator();

        while(listitr.hasNext()){
            int b= listitr.nextIndex();
            int i =listitr.next();
            System.out.println(b+" of "+i);
        }
    }
}
