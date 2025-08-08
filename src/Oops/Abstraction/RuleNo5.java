package oops.abstraction;

//If concrete/ non abstract class extends abstract class then its mandatory
// for that child class to provide method implementation of abstract method of seper class

abstract class Eat{
    abstract void eat();
}
public class RuleNo5 extends Eat {

    void eat(){
        System.out.println("Indians fav food is Rice");
    }

    public static void main(String[] args) {
        RuleNo5 rl = new RuleNo5();
        rl.eat();
    }
}
