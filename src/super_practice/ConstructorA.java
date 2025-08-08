package super_practice;

public class ConstructorA {

    ConstructorA(){
        System.out.println("no arg constructor A");
    }

}
 class ConstructorATest extends ConstructorA{
     ConstructorATest (){
         System.out.println("no arg constructor Test");
     }

     public static void main(String[] args) {
         ConstructorATest ct = new ConstructorATest();
     }
 }