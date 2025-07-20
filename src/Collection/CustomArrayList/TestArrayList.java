package Collection.CustomArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        CustomArrayList<Object> list = new CustomArrayList<>();
        list.add(10);
        list.add(20);
        list.add(true);
        list.add("Nikita");
        list.add(2.5);
        list.add('A');

        //Display all elements in CustomArrayList
        list.display();

        // Get element at index 1
        System.out.println("Element at index 1: " + list.get(1));

        // Remove element at index 0
        System.out.println("Removed element: " + list.remove(0));

        // Display after remove element.
        list.display();

    }
}
