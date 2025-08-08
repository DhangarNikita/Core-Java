package final_practice;
public class VariableFinal {
    final int a;

    VariableFinal(int a) {
        this.a = a;
    }

      /*  void change(int b){ //  we can not initialize final variable value in method body
         this.a=b;
   }*/

    public static void main(String[] args) {
        VariableFinal vf = new VariableFinal(10);
        System.out.println(vf.a);

    }
}


// example 2

class Abc{
    final String name="Nikita";
    void name(){
    //   name="Sneha";   Cannot assign a value to final variable 'name'
    }

    public static void main(String[] args) {
        Abc ab = new Abc();
        System.out.println(ab.name);
    }
}