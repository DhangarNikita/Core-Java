package collection.practice;
// 26. Create a LinkedList and perform various operations like add, remove, and iterate over it.
import java.util.Iterator;
import java.util.LinkedList;

public class LikedListOperation {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        System.out.println(list);

        // add at specific index
        list.addFirst("S");
        list.addLast("Z");
        System.out.println(list);

        // remove element
        list.remove("A");
        System.out.println(list);

        // remove from specific index
        list.remove(2);
        System.out.println(list);

        // remove first and last
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        System.out.println("Iterate collection");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }







    }
}
