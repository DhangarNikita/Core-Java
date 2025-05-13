package Static;
// If any object changes the value of the static variable,
// it will retain its value and increments by 1 (perform increment every time)for every object creation.

public class Increment {
    static int a=0;
    static int c=1;
    int b =1;

    Increment(){
        a++;  // It will increment the static variable by 1 for each object creation.
        b--;
        c=2; // set as 2
    }
    void count(){
        System.out.println("Increment value of a: "+a);
        System.out.println("Decrement Value of b: "+b);
        System.out.println("Value of c: "+c);

    }

    public static void main(String[] args) {
        Increment ic = new Increment();
        ic.count();
        Increment ic1 = new Increment();
        ic1.count();
    }
}
