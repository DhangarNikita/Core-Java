package exception.compile_time;

import java.lang.reflect.Field;

public class IllegalAccessException { // your custom class
    private int a = 10;
}

class demo {
    public static void main(String[] args) {
        IllegalAccessException il = new IllegalAccessException();

        try {
            // Access private field 'a' using reflection
            Field field = il.getClass().getDeclaredField("a");

            // Not setting accessible = true will cause IllegalAccessException
            System.out.println("Trying to access private field:");
            System.out.println(field.get(il)); // throws java.lang.IllegalAccessException

        } catch (java.lang.IllegalAccessException e) { // use fully qualified exception class
            System.out.println("Caught java.lang.IllegalAccessException: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
