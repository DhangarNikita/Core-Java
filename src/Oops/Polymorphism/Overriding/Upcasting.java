package Oops.Polymorphism.Overriding;

class Super {
    void show() {
        System.out.println("Show Method");
    }
}

public class Upcasting extends Super {
    @Override
    void show() {
        System.out.println("Child Class Method");
    }

    public static void main(String[] args) {
        Super s = new Upcasting();
        s.show();
    }
}
