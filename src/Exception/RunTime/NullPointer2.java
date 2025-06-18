package Exception.RunTime;

public class NullPointer2 {
    public static void main(String[] args) {
        String s= null;
        try{
            System.out.println(s.length());
        }catch(NullPointerException np){
            System.out.println(np.getMessage());
            np.printStackTrace();
        }
    }
}
