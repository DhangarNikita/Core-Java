package Inheritance.Hierarchical;

import java.util.Scanner;
 public class Person {

  void m1(){
   System.out.println("This is method 1 super class");
  }
 void m2(){
  System.out.println("This is method 2 super class");
 }
}

class Employee extends Person{

  void emp(){
   System.out.println("this is method 1 child class 1");
  }
}

class Staff extends Person{
  void sta(){
   System.out.println("This is method 1 child class 2");
  }
}

class Labor extends Person{
  void lab(){
   System.out.println("This is method 1 child class 3");
  }
}

class Management{
 public static void main(String[] args) {
      Employee emp = new Employee();
      emp.m1();
      emp.m2();
      emp.emp();

     System.out.println();

      Staff staff = new Staff();
      staff.m1();;
      staff.m2();
      staff.sta();

     System.out.println();

      Labor labs = new Labor();
      labs.m1();
      labs.m2();
      labs.lab();
 }
}