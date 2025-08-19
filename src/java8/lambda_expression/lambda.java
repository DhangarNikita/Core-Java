package java8.lambda_expression;

public interface lambda {
    void show();

}

class Print{
    public static void main(String[] args) {
        lambda ld =()-> System.out.println("Hello");
        ld.show();
    }
}
