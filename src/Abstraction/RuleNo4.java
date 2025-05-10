package Abstraction;

// If one abstract class extends another abstract class then its not mandatory
// for that child class to provide method implementations of abstract method of super class

public abstract class RuleNo4 {
    abstract int sum(int a, int b);
}

abstract class Summary extends RuleNo4{
    abstract int sub(int a, int b);
}

class Addition extends Summary{
    @Override
    int sub(int a, int b) {

        return a+b;
    }
    @Override
    int sum(int a, int b) {
        return a-b;
    }
    public static void main(String[] args) {
        Addition ad = new Addition();
        System.out.println(ad.sub(10,20));
        System.out.println(ad.sum(10,20));
    }
}