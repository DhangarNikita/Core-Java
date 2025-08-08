package oops.inheritance.Hierarchical;

public class Hierarchical {
    int a=10;
    int b=10;
}

class Add extends Hierarchical {
    void add() {
        System.out.println("Addition: " + (a + b));
    }
}

class Sub extends Hierarchical {
    void sub() {
        System.out.println("Subtraction: " + (a - b));
    }
}

class Div extends Hierarchical {
    void div() {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}

class Sum {
    public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);

      //  System.out.println("Enter value of a:");
       // int aa = sc.nextInt();

      //  System.out.println("Enter value of b:");
       // int bb = sc.nextInt();



        Add ad = new Add();
       // ad.a = aa;
       // ad.b = bb;

        Sub sb = new Sub();
       // sb.a = aa;
       // sb.b = bb;

        Div dv = new Div();
       // dv.a = aa;
       // dv.b = bb;

        ad.add();
        sb.sub();
        dv.div();

    }
}
