package casting.Upcasting;

public class OverrideUpcast {
    void add (int a, int b){
        int c=a+b;
        System.out.println(c);
    }
}

class Test extends OverrideUpcast{
    @Override
    void add (int a, int b){
        int c=a+b+100;
        System.out.println(c);
    }

    void sub (){
        System.out.println("child method");
    }

    public static void main(String[] args) {
        OverrideUpcast ou = new Test();
        //Test t = (Test)ou;

        ou.add(10,20);
        //ou.sub();
    }

}