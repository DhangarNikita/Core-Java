package oops.interface_practice;

//if one abstract class implement another interface so its no mandatory for that abstract class to implement superclass method.

//A normal class implement interface so that child class must have to implement methods of that interface or super class methods

public interface Rule1 {
    void n1();
}

 abstract class Animal implements Rule1 {
    abstract int sum (int a,int b);
 }

 class Addition extends Animal{
    public void n1(){
        System.out.println("This method is from interface 1");

    }

    int sum(int a, int b){
        return a+b;
    }

     public static void main(String[] args) {
         Addition ad = new Addition ();
         ad.n1();
         System.out.println(ad.sum(10,20));
     }
 }