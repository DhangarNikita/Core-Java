package Exception.TryCatch;
// ArrayIndexOutOfBoundsException exception
public class TryCatchEx6 {
    public static void main(String[] args) {
        try{
            int arr []= {10,20,30,40,50,};
            arr[4]=60;
            System.out.println(arr.length);
            arr[6]=20;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
