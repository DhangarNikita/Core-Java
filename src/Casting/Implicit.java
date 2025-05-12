package Casting;

public class Implicit {
    char z= 'c';     // take its ascii value
    byte a=10;
    short b= 20;
    int c= 30;
    long d=40;
    float e= 50;
    double f= 50;

    void add(){
        double g= z+b;
        System.out.println(g);
    }
    void sub (){
        float h = d-c;
        System.out.println(h);
    }

    public static void main(String[] args) {
        Implicit im = new Implicit();
        im.add();
        im.sub();
    }
}
