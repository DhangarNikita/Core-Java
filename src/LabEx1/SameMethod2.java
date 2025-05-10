package LabEx1;

public class SameMethod2 {

    int sum(int a, int b ){
        return a+b;
    }
    public static void main(String[] args) {
        SameMethod2 sm = new SameMethod2();
        int result = sm.sum(100,20);
        System.out.println(result);

    }
}

