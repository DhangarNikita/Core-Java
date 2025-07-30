package constructorchaining;

public class Art {
    Art(){
        System.out.println("No arg constructor of art");
    }

    Art (String a){
        this();
        System.out.println("arg constructor of art");
    }
}

class ArtTest extends Art{
    ArtTest (){
        super("Nikita");
        System.out.println("No arg constructor of test ");
    }

    ArtTest(int a ){
        this();
        System.out.println("arg constructor of test class");
    }

    public static void main(String[] args) {
        ArtTest at = new ArtTest(10);
    }
}