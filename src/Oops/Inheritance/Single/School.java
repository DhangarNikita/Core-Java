package oops.inheritance.Single;

public class School {
    void school(){
        System.out.println("this is 1st class");
    }
}

class Teacher extends School{
    void teacher(){
        System.out.println("This is 2nd class");
    }

    public static void main(String[] args) {
        Teacher tc = new Teacher();
        tc.school();
        tc.teacher();
    }
}