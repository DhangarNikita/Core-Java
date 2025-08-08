package oops.encapsulation.GetterSetter;

public class Person {
    //creating private variable
    private String name;
    private int age;

    // Create getter methods for each variable in the class.
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    // Create setter methods for each variable in the class.
    public void setName(String n){
        this.name= n;
    }

    public void setAge(int a){
        if(a>=18) {
            this.age = a;
        }else{
            System.out.println("Invalid age");
        }
    }
}
 class Display{
     public static void main(String[] args) {
         Person ps = new Person();
         ps.setName("Nikita");
         ps.setAge(25);

         String n= ps.getName();
         int a = ps.getAge();

         System.out.println("Student Name is: "+n);
         System.out.println("Student age is: "+ps.getAge());
     }
 }