package constructorchaining;

public class ConstructorSchool {
    ConstructorSchool(String name){
        System.out.println("This is ConstructorSchool constrictor for "+name);
    }
}

class Teacher extends ConstructorSchool{
    Teacher(){
        super("Java");
        System.out.println("This is Teacher constructor");
    }
}

class Student extends Teacher{
    public static void main(String[] args) {
        Student st = new Student();
    }
}