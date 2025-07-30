package collection.Iterator;
import java.util.*;
public class IteratorEx2 {
    public static void main(String[] args){
        ArrayList<Integer> arrlist = new ArrayList<>();
        for(int i =0; i<=10; i++){
            arrlist.add(i);
        }
        System.out.println(arrlist);

        Iterator<Integer> itr =arrlist.iterator();

        while(itr.hasNext()){
            int i=itr.next();
            System.out.print(i +",");

            if(i%2!=0){
                itr.remove();
            }
        }
        System.out.println(arrlist);
    }
}
