package Oops.Interface;

public interface MultipleInheritance {
    int sum (int a, int b);
}

interface Sub{
    int sub(int a, int b );
}


class Combine implements MultipleInheritance, Sub{
    @Override
    public int sum (int a, int b){
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    public static void main(String[] args) {
        Combine co = new Combine();
        System.out.println("Oops.Interface first method addition "+ co.sum(500,200));
        System.out.println("Oops.Interface Second Method substraction "+ co.sub(500,200));
    }
}