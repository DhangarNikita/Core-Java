package Exception.NestedTryCatchBlock;
// if no match is found in the inner catch block the control is transferred to the
// next outer catch block to handle the exception thrown by inner try block

public class Case3 {
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

            }catch (NullPointerException e)
            {
                System.out.println("Exception occurred " +e);

            }
        }catch(IndexOutOfBoundsException e)
        {
            System.out.println("Exception thrown: "+e);
        }
    }
}
