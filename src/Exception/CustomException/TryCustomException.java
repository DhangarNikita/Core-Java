package Exception.CustomException;

import java.util.Scanner;
public class TryCustomException extends RuntimeException {
    public TryCustomException() {
        super("age is not a valid");
    }

    public TryCustomException(String msg) {
        super(msg);
    }
}

    class Age {
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter your age");
                int n = sc.nextInt();
                if (n < 18) {
                    throw new TryCustomException("please enter valid age");
                } else {
                    System.out.println("Eligible for vote");
                }
            } catch (TryCustomException tc) {
                tc.printStackTrace();
            }
        }
    }

