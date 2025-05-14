package Polymorphism.Overriding;

public class CantReduce {
    public void m1(){
        System.out.println("this is public method");
    }
}

class CantReduceTest extends CantReduce{
//    @Override void m1(){   // if we override method then use same access modifier or else smaller access modifier
//        System.out.println("this is default method");
//
//    }
}