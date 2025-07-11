package Oops.Interface;
/// one class can extends another class as well as implement more than two interface at a time in single class.
interface Add{
    int add(int a, int b);
}

interface Substraction {
    int sub(int a, int b);

}

class Mul{
    int mul(int a, int b){
        return a*b;
    }
}

public class ExtendImplement extends Mul implements Add,Substraction {

    public int add(int a, int b){
        return a+b;
    }

    public int sub (int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        ExtendImplement ei = new ExtendImplement();
        System.out.println("Addition of two no is "+ei.add(10,20));
        System.out.println("Substraction of two no is "+ ei.sub(200, 100));
        System.out.println("Multiplication of two no is "+ei.mul(10,20));
    }
}
