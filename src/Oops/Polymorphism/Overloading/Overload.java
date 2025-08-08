package oops.polymorphism.Overloading;

public class Overload {
    static void sum(int p) {
        System.out.println(p);
    }

    void concate(String a, String b) {
        System.out.println(a + b);
    }
}

class MethodOverLoading extends Overload {

    public int sum(int m, int n, int o) {
        int c = m + n + o;
        System.out.println(c);
        return c;
    }

    void sum(int x, int y) {
        int sum = x + y;
        System.out.println(sum);
    }

    static private void sum(double x, int y, int z) {
        double sum = x + y + z;
        System.out.println(sum);
    }

    final void concate(String a, int b) {
        System.out.println(a + " " + b);
    }

    void concate(String x, int y, int z) {
        System.out.println(x + y + z);
    }

    public static void main(int a, int b, int c, int d) {
        int e = a + b + c + d;
        System.out.println(e);
    }

    public static void main(String[] args) {

        MethodOverLoading m = new MethodOverLoading();
        m.sum(10);
        m.sum(10, 20);
        m.sum(20, 30, 25);
        m.sum(50.00, 20, 30);
        m.main(500, 500, 500, 500);
        m.concate("Nikita", 23);
        m.concate("Java", 30, 30);
        m.concate("Method", "Overloading");
    }
}