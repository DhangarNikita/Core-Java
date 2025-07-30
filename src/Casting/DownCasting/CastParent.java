package casting.DownCasting;

public class CastParent {
    void m1(){
        System.out.println("this is parent class method m1");
    }
    void m2(){
        System.out.println("this is parent class method m2");
    }
}

class CastChild extends CastParent{
    void m3(){
        System.out.println("this is childe class method m3");
    }

    public static void main(String[] args) {
      CastParent cp= new CastChild();
        CastChild cc =(CastChild)cp;
        cc.m1();

        //CastChild cc = (CastChild)new CastParent();
        //cc.m1();    throw ClassCastException exception

    }
}