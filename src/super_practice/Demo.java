package super_practice;

public class Demo {
    int a;
    int b;
}

class  Demotest extends Demo{
    Demotest(int a,int b){
        super.a =a;
        super.b=b;
        System.out.println(super.a);
        System.out.println(super.b);
    }
    public static void main(String[] args) {
        Demotest dt = new Demotest(10,20);


    }
}