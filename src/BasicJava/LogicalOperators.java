package basicjava;

public class LogicalOperators {
    public static void main(String[] args){
        int a = 5;
        int b = 10;

        System.out.println(a > 0 && b < 20);  // true (both conditions are true)
        System.out.println(a > 10 || b > 5);  // true (second condition is true)
        System.out.println(!(a == b));        // true (a is not equal to b)

        // Ternary Operator

        int c = 10, d = 5;
        int max = (c > d) ? c : d;
        System.out.println(max);  // 10
    }
}
