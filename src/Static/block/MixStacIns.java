package Static.block;
// combination of static and instance block
public class MixStacIns {
    static{
        System.out.println("Static 1");
    }
    static{
        int a=10; int b=20;
        int c= a+b;
        System.out.println("Static 2: "+c);
    }

    {
        int a=100; int b=200;
        int c= a+b;
        System.out.println("Instance: "+c);
    }
    MixStacIns(){
        System.out.println("Constructor 1");
    }
    MixStacIns(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        new MixStacIns();
        new MixStacIns(10);
    }
}

/*
out put :
first class loaded into memory at that time static block first execute
then goes to main method
object creation time instance block execute
then constructor execute
then we create second object at that time again instance block execute and then constructor 2 execute
 */