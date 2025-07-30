package arrayprogramming;

public class RemoveElement {
    public static void main(String[] args){
        Integer[] arr={1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        arr[0]=null;
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
