package oops.polymorphism.Overriding;
// argument list or method signature must be exactly the same as that of the overridden/parent class method
public class RuleNo2 {
    void marryDate(){
        System.out.println("Marry date is 27 may 2025");
    }

    void engagementDate(){
        System.out.println("Engagement date is 25 may");
    }
}

class RuleNo2Test extends RuleNo2 {
    @Override
    void engagementDate(){
        System.out.println("Engagement date is 26 may");
    }

    public static void main(String[] args) {
        RuleNo2 test =new RuleNo2Test();  // upcasting
        test.engagementDate();
        test.marryDate();
    }
}