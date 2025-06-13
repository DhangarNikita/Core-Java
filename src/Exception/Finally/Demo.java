package Exception.Finally;
// try block contain finally block also
public class Demo {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        finally{
            System.out.println("Finally block");
        }
    }
}
