package Oops.Polymorphism.Overriding;
// A meyhod can override in only child class
public class Rule1 {
    void m1(){
        System.out.println("Parent method");
    }
}

class Rule1Test extends Rule1{
    @Override
    void m1(){
        System.out.println("Child method");
    }

    public static void main(String [] args){
        Rule1Test t = new Rule1Test();
        t.m1();
    }
}