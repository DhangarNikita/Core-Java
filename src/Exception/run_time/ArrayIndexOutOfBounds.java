package exception.run_time;

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int arr[] =new int[5];
        int ar[] = {1,2,4,5,6};
        try{
            //arr[6]=10;
            System.out.println(ar[6]);
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae.getMessage());
            ae.printStackTrace();
        }
    }
}
