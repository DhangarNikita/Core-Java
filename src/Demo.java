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

class Str {
    final public static void main(String[] args) {
        String st = "Nikita";
        st = "abc";
        System.out.println(st);

    }
}
/*
    class A extends Str{
        public static void main(String[] args) {

        }
    }*/

