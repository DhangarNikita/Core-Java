package Exception.Propogation;

import java.io.PrintStream;
import java.util.Scanner;

public class CustomTryWithResources implements AutoCloseable {

    static int num1;
    static int num2;

    public void add() {
        int add = num1 + num2;
        System.out.println("Sum of Two Numbers is : " + add);
    }

    public void sub() {
        int sub = num1 - num2;
        System.out.println("Sub of Two Numbers is : " + sub);
    }

    public void mul() {
        int mul = num1 * num2;
        System.out.println("Mul of Two Numbers is : " + mul);
    }

    public void div() {
        int div = num1 / num2;
        System.out.println("Div of Two Numbers is : " + div);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        num1 = sc.nextInt();
        System.out.print("Enter Second Number : ");
        num2 = sc.nextInt();

        try(CustomTryWithResources obj = new CustomTryWithResources();
            CustomTryWithResources obj1 = new CustomTryWithResources()){

            obj.add();
            obj.sub();
            obj.mul();
            obj1.div();

        } catch (Exception e) {
            e.printStackTrace();
//            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("End of Program");
    }
}
