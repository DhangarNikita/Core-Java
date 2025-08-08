package oops.polymorphism.Overriding;
// The return type should be the same or a subtype of the return type declared in the original overridden method in super class
public class Rule3 {
    Object m1(){
        System.out.println("Object return type");
        return new RuleNo3();
    }
}

class Rule3Test extends Rule3{
    @Override
    Rule3 m1(){
        System.out.println("child override method with covariant data type");
        return null;
    }

    public static void main(String[] args) {
        Rule3Test rt = new Rule3Test();
        rt.m1();
    }
}