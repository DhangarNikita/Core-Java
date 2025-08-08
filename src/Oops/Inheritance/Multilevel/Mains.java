package oops.inheritance.Multilevel;

class A{
    void m1(){
        System.out.println("This is method 1 in class A");
    }

    void m2(){
        System.out.println("This is method 2 in class A");
    }
}

class B extends A{
    void m3(){
        System.out.println("This is method 1 in class B");
    }
}


class C extends B{
    void m4(){
        System.out.println("This is method 1 in class C");
    }
}
public class Mains extends C {
            public static void main(String[] args) {
                Mains maa = new Mains();
                maa.m1();
                maa.m2();
                maa.m3();
                maa.m4();
            }
}
