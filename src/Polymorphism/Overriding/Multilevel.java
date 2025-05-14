package Polymorphism.Overriding;

public class Multilevel {
    protected int add(int a, int b) {
        int c = a + b;
        System.out.println("Multilevel"+c);
        return c;

    }
}


class Multi extends Multilevel {
    @Override
    public int add(int a, int b) {
        int e = b + a;
        System.out.println("Multi" +e);
        return e;
    }
}



class MultiTest extends Multi{
    @Override
    public int add(int a, int b) {
        int e = a + a;
        System.out.println("MultiTest: "+e);
        return e;
    }

    public static void main(String[] args) {
        MultiTest mt = new MultiTest();
        mt.add(10,20);
    }
}