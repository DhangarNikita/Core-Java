package Oops.Abstraction;

// If we define any abstract method in a class then that class must be abstract
public abstract class RuleNo2 {

    abstract void dance();
}

class Rule extends RuleNo2{
    @Override
    void dance() {
        System.out.println("Classical");
    }

    public static void main(String[] args) {
        Rule rl = new Rule();
        rl.dance();
    }
}