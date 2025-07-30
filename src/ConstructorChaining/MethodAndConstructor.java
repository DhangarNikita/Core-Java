package constructorchaining;

class Addition{
    Addition(int a, int b){
        int c =a+b;
        System.out.println("This is first constructor addition "+c);
    }

    void add(int a, int b){
        System.out.println("This is first method addition "+(a+b));
    }
}

class Substraction extends Addition{
    Substraction (int a, int b){
        super(10,20);
        //int c= a-b;
        System.out.println("This is seccond costructor substraction "+(a-b));
    }
}


public class MethodAndConstructor extends Substraction {
    MethodAndConstructor(){
        super(300,200);
    }

    public static void main(String[] args) {
        MethodAndConstructor mc = new MethodAndConstructor();
        mc.add(10,20);
    }
}
