package oops.polymorphism.Overriding;
// if we override method then use same access modifier or else smaller access modifier

public class RuleNo4 {
    public void m1(){
        System.out.println("this is public method");
    }
    void m2(){
        System.out.println("default access modifier");
    }
}

class RuleNo4Test extends RuleNo4 {
    /*
    @Override
    void m1(){
        System.out.println("this is default method");

    }
    */

    @Override
    public void m2(){
        System.out.println("Child public access modifier");
    }
}