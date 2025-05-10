package ConstructorChaining;

public class Students {
    Students(String name){
        System.out.println("Student name is "+name);
    }
}

class RollNo extends Students{
    RollNo(int a){
        super("Nikita");
        System.out.println("Student Roll no is "+a);
    }
}

class Division extends RollNo{
    Division(String rollNo){
        super(21);
        System.out.println("Student Division is "+rollNo);
    }

    public static void main(String[] args) {
        Division dv = new Division("A");
    }
}