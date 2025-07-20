package Oops.Interface;

public interface Extending2Interface {
    void m1();
    void m2();
}

interface B extends Extending2Interface{
    void m3();
}

class C implements B {
    @Override
    public void m1(){
        System.out.println("Oops.Interface 1 with m1 method");
    }
    @Override
    public void m2(){
        System.out.println("Oops.Interface 1 with m2 method");
    }
    @Override
    public void m3(){
        System.out.println("Oops.Interface 2 with m3 method");
    }

    public static void main(String[] args) {

        C c = new C();
        c.m1();
        c.m2();
        c.m3();
    }
}
