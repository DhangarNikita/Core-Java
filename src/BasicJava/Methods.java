package BasicJava;

public class Methods {
    // syntax 1
    void m1(){
        System.out.println("Methos 1");
    }

    //syntax 2
    void m2(int a){
        int b =10;
        int c= a+b;
        System.out.println(c);
    }

    // syntax 3
    int m3(){
        int a=10,b=20,c;
        c=a+b;
        return c;

        }
        //syntax 4
    int m4(int a){
        int c= a;
        return c;
    }

    public static void main(String[] args) {
        Methods m = new Methods();
        m.m1();
        m.m2(10);
        int c;
        c=m.m3();
        System.out.println(c);
        System.out.println(m.m4(20));
    }
}
