package Exception.RunTime;

public class NullPointers {

    void mi(){
        System.out.println("m1 method");
    }

    public static void main(String[] args) {
        NullPointers np = null;
        try{
            np.mi();
        }catch(NullPointerException n){
            System.out.println(n);
            n.printStackTrace();
        }
    }

}
