package LabEx1;
//Write Program without main method and execute that program
public class NoMethod {
    void print(){
        System.out.println("there is no method inside this class");
    }
}

class MethodMain{
    public static void main(String[] args) {
        NoMethod nm = new NoMethod();
        nm.print();
    }
}