package oops.polymorphism.Overriding;
// if only one child to want to override the method

public class Hierarchical {
    void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }
}

class Xx extends Hierarchical{
    public static void main(String[] args) {
        Xx x = new Xx();
        x.add(10,20);
    }
}

class Yy extends Hierarchical{
    public static void main(String[] args) {
        Yy y = new Yy();
        y.add(10,20);
    }
}


class Zz extends Hierarchical{
    @Override
    void add(int a, int b) {
       int c = a+b+200;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Zz z = new Zz();
        z.add(10,20);
    }
}