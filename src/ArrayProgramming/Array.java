package ArrayProgramming;

public class Array {
    public static void main(String[] args) {
        int arr [] =new int[5];
        arr[0]=5;
        arr[1]=6;
        arr[2]=8;
        arr[3]=3;
        arr[4]=8;
        System.out.println(arr[2]);


        int arr1[] ={1,2,5,4,3,};
       for(int i=0; i<arr1.length;i++){  //print array using for loop
           System.out.println(arr1[i]);
       }

       // in reverse order
        for( int j=arr1.length-1; j>=0;j--){
            System.out.print(arr1[j]);
        }
    }
}
