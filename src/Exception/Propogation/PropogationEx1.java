package Exception.Propogation;

public class PropogationEx1 {

    void m1(){
        System.out.println(10/0);
    }
    void m2(){

        m1();
    }
    void m3(){
        try{
            m2();
        }catch(ArithmeticException ae){
            ae.printStackTrace();
          //  System.out.println(ae.getMessage());
        }
    }
    public static void main(String[] args) {
        PropogationEx1 pe = new PropogationEx1();
        pe.m3();
    }
}

