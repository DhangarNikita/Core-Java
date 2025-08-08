package exception.nested_try_Catch_block;
// f an exception does not occur inside the outer try block, the control of execution enters into the inner try block.
public class Case2 {
    public static void main(String[] args) {
        String s = "Nikita Dhangar";
        int arr []={1,2,3,4,5};

        try
        {
            int length =s.length();
            System.out.println(length);

            try
            {
                int x=6;
                System.out.println(arr[x]);

            }catch (IndexOutOfBoundsException e)
            {
                System.out.println("Exception occurred " +e);

            }
        }catch(NullPointerException e)
        {
            System.out.println("Exception thrown: "+e);
        }
    }
}
