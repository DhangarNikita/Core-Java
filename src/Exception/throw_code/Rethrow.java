package exception.throw_code;

public class Rethrow {
    public static void main(String[] args) {
        try{
            String s = "Nikita";
            System.out.println(s.charAt(6));
        }catch (StringIndexOutOfBoundsException se){
            System.out.println("exception");
            throw se;
        }
    }
}
