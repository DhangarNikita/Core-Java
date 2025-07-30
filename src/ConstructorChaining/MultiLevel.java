package constructorchaining;

public class MultiLevel {

    MultiLevel(){

        System.out.println("This is Gp class default constructor");
    }

    MultiLevel(int a, int b){
        System.out.println(a+b+ " This is GP class parameterized constructor");
    }
}

class Multiparent extends MultiLevel{
    Multiparent(){
        //super();
        super(100,200);
        System.out.println("this is parent class constructor");
    }
}

class MultiChild extends Multiparent {
    MultiChild(int a, int b){
        System.out.println(a/b+ " This is parameterized constructor of child class");
    }

    public static void main(String[] args) {
        MultiChild mc = new MultiChild(500,2);
    }
}