package Lab.LabEx1;

public class SameMethod1 {
    int sum(int a, int b ){
        return a+b;
    }
    public static void main(String[] args) {
        SameMethod1 sm = new SameMethod1();
       int result = sm.sum(10,20);
        System.out.println(result);

    }
}

