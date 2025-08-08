package exception.nested_try_Catch_block;

// We can use multiple nested try-catch blocks
public class Case5 {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block starts.");

            try {
                int num = 100 / 0; // This will throw ArithmeticException

                try {
                    System.out.println("Inner try block starts.");
                } catch (ArithmeticException e) {
                    System.out.println("Inner catch: Cannot divide by zero.");
                }

            } catch (ArithmeticException e) {
                System.out.println("Middle catch: Division by zero occurred.");
            }

            int[] arr = new int[2];
            arr[5] = 50; // This will throw ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index is out of bounds.");
        }

        System.out.println("Program continues after all nested try-catch blocks.");
    }
}
