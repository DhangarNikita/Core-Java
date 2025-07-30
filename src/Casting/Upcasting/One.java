package casting.Upcasting;

public class One {
    void m1(){
        System.out.println("this is parent class method m1");
    }
    void m2(){
        System.out.println("this is parent class method m2");
    }
}


class Two extends One{
    void m3(){
        System.out.println("this is childe class method m3");
    }

    public static void main(String[] args) {
        One on = new Two();  // upcasting
        on.m1();
        on.m2();
        //on.m3();    // give compile time error


}
}