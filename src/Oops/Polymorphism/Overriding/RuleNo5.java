package oops.polymorphism.Overriding;
// we can not override final method
public class RuleNo5 {
    final static int a = 10;
    final public void display(){
        System.out.println("Parent Class Method");
    }
}

class Child extends RuleNo5 {
   /* @Override
    public void display() {
        super.display(); // call parent method
        System.out.println("Child Class Method");
    }*/

    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        System.out.println(a);
    }
}
