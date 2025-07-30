package covariantreturntype;

public class ObjectCo {
    Object m1(){
        System.out.println("object return type");
       return null;
    }
}


class ObjectCoTest extends ObjectCo{
    @Override
    String m1() {
        System.out.println("String return type");
        return "Hii";
    }

    public static void main(String[] args) {
        ObjectCoTest test = new ObjectCoTest();
        test.m1();
    }
}