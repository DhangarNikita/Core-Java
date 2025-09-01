package java8.stream.stream_creation;

import java.util.stream.Stream;

class Demo{

}

public class SinglePar {
    public static void main(String[] args) {
        Stream<Demo> demo =Stream.of(new Demo());
        System.out.println(demo.count());
    }
}
