package Final;
// we can overload method but not override

public class MethodFinal {
    final void m1(String a){
        System.out.println("Final method m1");
    }

   void m1( final int a){
        //a=10;  Java Final Parameter (If we declare any parameter as final, the value of parameter cannot be changed after initialization)
        System.out.println("Final method m1");
    }
}

class MethodTest extends MethodFinal{
//    void m1(String a){
//        a="Nikita";
//        System.out.println("Final method m1");
//    }

    public static void main(String[] args) {
        MethodTest ts = new MethodTest();
        ts.m1("nikita");
        ts.m1(10);
    }
}