package exception.compile_time;

public class ClassNotFound {
    public static void main(String[] args) {
        /*Class.forName("Block.Demo");
        System.out.println("class found");*/

        try{
           // Class.forName("Exception.RunTime.Arithmetic");
            Class.forName("block.Free");   // Class.forname() used to load the class at run time.
            System.out.println("class found");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException!");
            System.out.println("Exception Message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
