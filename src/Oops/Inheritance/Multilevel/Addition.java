package Oops.Inheritance.Multilevel;

public class Addition {
    int a=10;
    int b=20;
    int c=30;
    int d=40;
}

 class Subtraction extends Addition{
    void sub(){
        System.out.println(a-b);
    }
 }

 class Multiplication extends Subtraction{
    void mul(){
        System.out.println(c*d);
    }
 }

 class Main extends Multiplication {
     public static void main(String[] args) {
         Main mn = new Main();
         mn.mul();
         mn.sub();
     }
 }