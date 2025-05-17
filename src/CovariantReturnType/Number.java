package CovariantReturnType;

public class Number {
    Number mm1(int a, int b){
       int c=a+b;
        System.out.println(c +" super class");
        return null;
    }
}


class Test extends Number{
    @Override
    Number mm1(int a, int b) {
        int c=a+b+100;
        System.out.println(c);
        return null;
    }

    public static void main(String[] args) {
        Test ts = new Test();
        ts.mm1(10,30);
    }
}
