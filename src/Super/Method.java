package Super;

public class Method {
    void add(int a, int b){
        System.out.println(a+b);
    }

    void sub(int a,int b){
        System.out.println(a-b);
    }
}

class MethodTest extends Method{
    void Super(){
        super.add(10,20);
        super.sub(20,10);
    }

    public static void main(String[] args) {
        MethodTest mt = new MethodTest();
        mt.Super();
    }
}