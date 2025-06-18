package Exception.RunTime;

public class StringIndexOutOfBounds {
    public static void main(String[] args) {
        String s ="Nikita";
        try{
            System.out.println(s.charAt(7));
        }catch(StringIndexOutOfBoundsException se){
            System.out.println(se.getMessage());
            se.printStackTrace();

        }
    }
}
