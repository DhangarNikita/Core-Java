package lab.lab3;
import lab.labEx3.AccessDemo;

public class SubClass extends AccessDemo {
    void accessFromSubclass() {
        System.out.println("Inside SubClass (in different package)");

        // System.out.println("privateVar = " + privateVar);    //  Not accessible
        // System.out.println("defaultVar = " + defaultVar);    //  Not accessible
        System.out.println("protectedVar = " + protectedVar);   //  Accessible via inheritance
        System.out.println("publicVar = " + publicVar);
    }
}

class TestAccess {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        obj.showAccess();  // public method

        System.out.println("Accessing from another package:");

        // System.out.println("privateVar = " + obj.privateVar);
        // System.out.println("defaultVar = " + obj.defaultVar);
        // System.out.println("protectedVar = " + obj.protectedVar); //  (not through inheritance)
        System.out.println("publicVar = " + obj.publicVar);

        // Subclass access
        SubClass sub = new SubClass();
        sub.accessFromSubclass();
    }
}

