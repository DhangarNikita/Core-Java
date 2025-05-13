package Static;
// static members (static variables) can be accessed from both instance and static area
// (i.e. instance and static methods) directly using the class name or without the class name.
public class Test {
    int a= 10;
    static int b=20;
    void m1 (){
        System.out.println(b);
        System.out.println(a);
    }

    static void m2(){
        System.out.println(b);
        //Test t = new Test();
        //System.out.println(t.a); // access using object
        //System.out.println(a); // throw error because we can not access non static variable in static variable without object
    }

    public static void main(String[] args) {
        Test ts = new Test();
        ts.m1();
        System.out.println("=================");
        m2();
    }
}
