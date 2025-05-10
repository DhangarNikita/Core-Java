package Interface;

public interface UsingInterface {
    int a  = 10;   // by default static final
    void m1();   // by default public and abstract
}

class A implements UsingInterface{

    @Override
    public void m1() {
        System.out.println("print the value of a "+a);
    }

    public static void main(String[] args) {
        A a = new A();
        a.m1();
    }
}