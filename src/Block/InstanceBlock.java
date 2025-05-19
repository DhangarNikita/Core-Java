package Block;
// instance block execute after object create and before constructor execute
// execute at every object creation
public class InstanceBlock {
    {
        System.out.println("Instance block 1");
    }

    {
        System.out.println("Instance block 2");
    }
    {
        System.out.println("==================================");
    }
    public static void main(String[] args) {
        InstanceBlock ib = new InstanceBlock();
        InstanceBlock ib1 = new InstanceBlock();



    }
}
