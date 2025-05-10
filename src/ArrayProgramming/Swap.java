package ArrayProgramming;

public class Swap {
    public static void main(String[] args) {
        //swap when array of index 0 is greater

        int arr[] = new int[2];
        arr[0]=60;
        arr[1]=50;

        System.out.println(arr[0] +" " +arr[1]);
        int temp =0;
        if(arr[0]>arr[1]){
            temp= arr[0];
            arr[0]= arr[1];
            arr[1]=temp;
            System.out.println(arr[0] +" "+ arr[1]);
        }
    }
}
