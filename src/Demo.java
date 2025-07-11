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
