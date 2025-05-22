package Oops.Polymorphism.Overloading;
// overloading perform using inheritance that doesn't make sense because it is method overriding not a overloading
public class UsingInheritance {
    int sub(int a,int b){
        int c=a-b;
        System.out.println("int,int");
        return c;

    }

    int sub(int a,int b, int c){    // rule 1 same name with different parameters
        int d=a-b-c;
        System.out.println("int,int,int");
        return d;
    }

    long sub(int a, long b, int c){   // same method name but different data type
        long d=a-b-c;
        System.out.println("int,long,int");
        return d;
    }
}

class Child extends UsingInheritance{
    long sub(long a, int b, int c){   // same method name but different order of parameter
        long d=a-b-c;
        System.out.println(" Child long,int,int");
        return d;
    }

    long sub(int a, long b, int c) {  // same method as parent class method overriding
        long d = a - b - c;
        System.out.println(" child int,long,int");
        return d;
    }

    public static void main(String[] args) {
        Child cd = new Child();
        System.out.println(cd.sub(2, 3));
        System.out.println(cd.sub(2, 3, 4));
        System.out.println(cd.sub(2, 3L, 4)); // overriding
        System.out.println(cd.sub(2L, 3, 4));
    }
}