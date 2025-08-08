package oops.encapsulation.Example;

public class Encapsulation {
    private int id;

    public int getid(){
        return id;
    }

    public void setId(int i){
        this.id=i;
    }
}

class EncapTest{
    public static void main(String[] args){
        Encapsulation en = new Encapsulation();
        en.setId(10);
        //en.id;   compile time error
        //System.out.println(en.getid());
        int a=en.getid();
        System.out.println("Employee Id is: "+a);
    }
}