package Oops.Interface;

//we create a reference of a interface and then we create a object of class

public interface ReferenceObject {
    void cal(int l, int b);
}

class RectArea implements ReferenceObject{

    @Override
    public void cal(int l, int b) {
        int area = l*b;
        System.out.println("Area of rectangle is "+area);
    }
}

class RectPer implements ReferenceObject{
    public void cal(int l, int b){
        int pre = 2*(l*b);
        System.out.println("Perimeter of rectangle is "+pre);
    }
}

class Final {
    public static void main(String[] args) {
        ReferenceObject ob;
        ob = new RectArea();
        ob.cal(10,20);

        ob = new RectPer();
        ob.cal(10,20);
    }
}