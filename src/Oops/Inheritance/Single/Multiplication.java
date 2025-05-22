package Oops.Inheritance.Single;

public class Multiplication {
    int mul(int a, int b){
        return a*b;
    }
}

class Division extends Multiplication{
    int div(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        Division dv = new Division();
        System.out.println(dv.mul(10,20));
        System.out.println(dv.div(10,2));
    }
}