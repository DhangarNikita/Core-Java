package collection.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //Add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        List<Integer> list3 =new ArrayList<>();
        list3.add(11);
        list3.add(12);
        list3.add(13);

        List<String> st =new ArrayList<>();
        st.add("N");
        st.add("i");
        st.add("k");
        st.add("i");
        st.add("t");
        st.add("a");

        System.out.println(st);
        //addAll
        List<Integer> list1 =new ArrayList<>();
        list1.addAll(list);
        System.out.println(list1);

        //add at index
        list.addAll(2 ,list3);
        System.out.println(list);

        //add an element at a particular position index in the list
        list.add(2,100);
        System.out.println(list);

        //remove
        list.remove(2);
        System.out.println(list);

        //remove char remove first occurrence
        st.remove("i");
        System.out.println(st);

        //set
        st.set(2,"m");
        System.out.println(st);

        // size
        System.out.println(list3.size());

        //contains
        boolean m = st.contains("N");
        System.out.println(m);

        System.out.println(list.contains(2));

        // int indexOf
       int a= st.indexOf("N");
        System.out.println(a);

        int b= st.lastIndexOf("a");
        System.out.println(b);

    }
}
