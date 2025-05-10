package Inheritance.Single;

public class Addition {
    void add(int a, int b){
        int c = a+b;
        System.out.println(c);
    }
}

class Substraction extends Addition{
    void sub(int a,int b){
        int c=b-a;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Substraction sb = new Substraction();

        sb.add(500,200);
        sb.sub(200,500);
    }
}