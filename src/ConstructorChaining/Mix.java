package constructorchaining;

class A{
    A(){
        System.out.println("This is constructor A");
    }
}

class B extends C{
    B(){
        System.out.println("This is constructor B");
    }
}

class C extends Art {
    C() {
        System.out.println("This is constructor C");

    }
}

public class Mix extends B{
    public static void main(String[] args) {
        Mix mx = new Mix();
    }

}
