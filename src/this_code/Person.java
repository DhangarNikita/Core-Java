package this_code;
//Write a Java class Person with a constructor that sets name and age using
// parameters with the same names as the instance variables. Use this to differentiate between them.
public class Person {
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person ps = new Person("Nikita", 22);
        System.out.println(ps.name +" "+ ps.age);
    }
}
