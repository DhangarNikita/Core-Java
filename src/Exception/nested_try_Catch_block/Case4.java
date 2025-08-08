package exception.nested_try_Catch_block;
// if no match is found Java runtime system will handle exception at runtime and the program terminates abnormally.
public class Case4 {
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
        }catch(ArithmeticException e)
        {
            System.out.println("Exception thrown: "+e);
        }
        System.out.println("out of the block");
    }
}
