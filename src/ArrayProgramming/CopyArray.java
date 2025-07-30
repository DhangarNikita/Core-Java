package arrayprogramming;

public class CopyArray {
    public static void main(String[] args) {
        int arr[] ={5,6,8,9,7,2,3,6,4,5,};

        int arr1[] = new int[arr.length]; // empty array

        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]);
        }
        System.out.println(); // for new line

        for(int j=0; j<arr.length;j++){
            arr1[j]=arr[j];

        }
        for(int k=0; k<arr1.length;k++){
            System.out.print(arr1[k]);
        }
    }
}
