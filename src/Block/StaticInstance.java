package Block;

public class StaticInstance {
    static{
        {
            System.out.println("instance block under static block");
        }
    }

    public static void main(String[] args) {
        StaticInstance si = new StaticInstance();
        StaticInstance si1 = new StaticInstance();


    }
}
