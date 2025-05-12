package LabEx3;

import Lab3.SubClass;

public class AccessDemo {
    private int privateVar = 1;
    int defaultVar = 2;
    protected int protectedVar = 3;
    public int publicVar = 4;

    public void showAccess() {
        System.out.println("Inside package1.AccessDemo");
        System.out.println("privateVar = " + privateVar);
        System.out.println("defaultVar = " + defaultVar);
        System.out.println("protectedVar = " + protectedVar);
        System.out.println("publicVar = " + publicVar);
    }
}

class SubClassTest extends AccessDemo {
    void accessFromSubclass() {
        System.out.println("Inside SubClass (in different package)");

        // System.out.println("privateVar = " + privateVar);    //  Not accessible
        System.out.println("defaultVar = " + defaultVar);    //     accessible
        System.out.println("protectedVar = " + protectedVar);   //  Accessible via inheritance
        System.out.println("publicVar = " + publicVar);
    }
}

class SubTestAccess {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        obj.showAccess();  // public method

        System.out.println("Accessing from same package:");

        // System.out.println("privateVar = " + obj.privateVar);
        System.out.println("defaultVar = " + obj.defaultVar);
        System.out.println("protectedVar = " + obj.protectedVar);
        System.out.println("publicVar = " + obj.publicVar);


    }
}