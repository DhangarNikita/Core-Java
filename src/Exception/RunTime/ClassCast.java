package Exception.RunTime;

public class ClassCast {
    void m1(){
        System.out.println("parent class");
    }
}

class sub extends ClassCast{
    public static void main(String[] args) {
        try{
            sub sb = (sub)new ClassCast();
            sb.m1();
        }catch(ClassCastException cc){
            System.out.println(cc.getMessage());
            cc.printStackTrace();
        }
    }

}