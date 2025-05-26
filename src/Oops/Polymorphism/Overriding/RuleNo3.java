package Oops.Polymorphism.Overriding;
// Return type must be same for both parent and child class method(parent child relationship)


public class RuleNo3 {
    int m1(){
        int c=10;
        System.out.println("Method 1");
        return c;
    }

}


class RuleNo3test extends RuleNo3 {
    @Override
    int m1(){
        int c=10;
        System.out.println("overridden Method 1");
        return c+10;
    }
    public static void main(String[] args){
        RuleNo3test rt = new RuleNo3test();
        System.out.println(rt.m1());
    }


}
