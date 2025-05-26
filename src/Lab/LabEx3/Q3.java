package Lab.LabEx3;
//Accessing above 4 members from another class program within the same package.
public class Q3 {
    private int a=10;
    public int b=20;
    int c = 30;
    protected int d=40;

}

class QTest3{
    public static void main(String[] args) {
        Q3 q = new Q3();
       // System.out.println(q.a);   //not accessible its private
        System.out.println(q.b);
        System.out.println(q.c);
        System.out.println(q.d);
    }
}