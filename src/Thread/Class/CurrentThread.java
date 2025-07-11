package Thread.Class;

public class CurrentThread extends Thread {
    public static void main(String[] args){
        // Create a Thread object by calling currentThread() method of class Thread.
        Thread obj = Thread.currentThread();
        System.out.println("Current thread is " +obj); // print name and priority12332442
        System.out.println("Name of current thread is " +obj.getName());
        obj.setName("New Thread");
        System.out.println("Name of thread after set by set method is: "+obj);
        System.out.println(obj.getName());

    }
}
