package lab.labEx1;

public class MethodCalling {

    void firstmethod() {
        System.out.println("Hello, I'm the first method");
        secondmethod(); // calling second method   this treted as a this.secondmethod();
    }

    void secondmethod() {
        System.out.println("Hello, I'm the second method");
    }

    public static void main(String[] args) {
        MethodCalling mc = new MethodCalling(); // create object inside main
        mc.firstmethod(); // call first method using object
    }
}


