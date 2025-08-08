package oops.polymorphism.Overriding;
// we can not override static method its method hiding process
public class RuleNo6
{
    static void m1()
    {
        System.out.println("m1-X");
    }
}


 class RuleNo6Test extends RuleNo6
{
   // @Override
    static void m1()
    {
        System.out.println("m1-Y");
    }

    public static void main(String[] args)
    {
        RuleNo6Test rt = new RuleNo6Test();
        rt.m1();
    }
}



