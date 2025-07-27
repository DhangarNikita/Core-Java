package Practice;

public class SumDivisibleBy9 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        System.out.println("Numbers divisible by 9 are : ");
        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                System.out.print(i + " ");
                count++;
                sum += i;
            }
        }
        System.out.println();
        System.out.println("Count of numbers are : " + count);
        System.out.println("Sum of numbers are : " + sum);
    }
}
