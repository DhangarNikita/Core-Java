package practive_programs.basic_programs;

public class SortAnArray {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 4, 7, 1, 2};
        int temp;
        System.out.println("Array Before Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array After Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
