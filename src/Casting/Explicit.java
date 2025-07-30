package casting;

public class Explicit {
    double  d= 30.33;
    int i= (int)d;

    float f= 50.12f;
    char c= (char)f;

    public static void main(String[] args) {
        Explicit ex = new Explicit();
        System.out.println(ex.i);
        System.out.println(ex.c);


    }
}
