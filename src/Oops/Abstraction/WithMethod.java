package Oops.Abstraction;

public abstract class WithMethod {
    static{
        System.out.println("Static block");
    }

    {
        System.out.println("Instatnce block");
    }
    WithMethod(){
        System.out.println("Constructor");
    }
    void m() {
        System.out.println("Nikita");
    }

    //abstract void m3();

    static void m2(){
        System.out.println("Static method");
    }
    public static void main(String[] args) {
        System.out.println("Main method in abstract class");
    }
}


class Test{
    public static void main(String[] args) {
        WithMethod wm = new WithMethod(){};
        wm.m();
        WithMethod.m2();

    }
}