package Demo;

public class Variable {

    int a;
    static int b;

    public Variable(int a,int b){
        this.a=a;
        this.b=b;
    }
    void m1() {
        a=500;
        b = 20;  // This line is only executed IF m1() is called
    }

    public static void main(String[] args) {
        Variable var = new Variable(10,20);
       // var.a = 10;
        System.out.println(var.a);  // Prints 10
        System.out.println(b);      // Prints 0, because m1() was not called
    }
}
