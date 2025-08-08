package oops.abstraction;

// It's not mandatory to have abstract method in abstract class
// means anstract class contain both method abstract as well as normal(concrete) method

abstract class Eating {
    abstract void india();

    void usa() {
        System.out.println("Spoon");
    }
}

class Style extends Eating {
    void india() {
        System.out.println("Using Hand");
    }
}

public class RuleNo1 {
    public static void main(String[] args) {
        Style ea = new Style();
        ea.india();
        ea.usa();
    }
}