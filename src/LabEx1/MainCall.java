package LabEx1;

public class MainCall {
    public static void main(String [] args) {
        System.out.println("This is A's main method.");
    }
}
class B {
    public static void main(String[] args) {
        System.out.println("This is B's main method.");
        MainCall.main(null);
    }
}

//class c{
//    public static void main(String[] args) {
//        int arr[] new int[-2];
//    }
//}