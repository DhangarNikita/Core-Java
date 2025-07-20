package practive_programs.basic_programs;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {5, 47, 8, 9, 3, 2};

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] >= arr[j] && arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        System.out.println("Maximum Number Is : "+max);

    }
}
