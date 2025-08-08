package exception.nested_try_Catch_block;
// Exception occurred in outer try block then control goes to outer catch block inner try block is skip
public class Case1 {
    public static void main(String[] args) {
        String s = "Nikita Dhangar";
        int arr []={1,2,3,4,5};

        try
        {
           s=null;
           int length =s.length();
            System.out.println(length);

            try
            {
                int x=6;
                System.out.println(arr[x]);

            }catch (IndexOutOfBoundsException e)
            {
                System.out.println("Exception occurred" +e);

            }
        }catch(NullPointerException e)
        {
            System.out.println("Exception thrown: "+e);
        }
    }
}
