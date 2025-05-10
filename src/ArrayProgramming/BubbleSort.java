package ArrayProgramming;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] ={10,60,70,50,90,100,20,40,80,30};
        int temp;
        //ascending order

        for(int i=0; i<arr.length;i++){
            for(int j= i+1; j<arr.length;j++ ){
                if(arr[i]>arr[j]){    // for descending  only change is----- arr[i]<arr[j]
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]= temp;
                }

                }
            }
        for(int k =0; k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
