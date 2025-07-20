@FunctionalInterface
public interface Demo {
    void show();
}

@FunctionalInterface
interface Test extends Demo{
    void test();

    @Override
    default void show(){

    }
}

class Str{
    public static void main(String[] args) {
        String st = "Nikita";
        st="abc";
        System.out.println(st);


    }
}