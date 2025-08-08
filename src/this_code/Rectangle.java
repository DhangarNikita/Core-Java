package this_code;
/*
Create a class Rectangle that has two constructors: one default and one parameterized.
Use this() in the default constructor to call the parameterized one with default values.
*/

public class Rectangle {
    int length;
    int width;

    Rectangle( int length, int width){
        this.length=length;
        this.width= width;
    }
    Rectangle(){
        this(10,20);
    }
    void display(){
        System.out.println(length+" "+width);
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Rectangle rects = new Rectangle(15,20);

        rect.display();
        rects.display();
    }
}
