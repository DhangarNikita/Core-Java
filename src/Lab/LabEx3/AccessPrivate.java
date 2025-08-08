package lab.labEx3;
//) Write a sample demo program regarding accessible modifiers using private.
public class AccessPrivate {
    private String name ="Nikita";  // private variable


    // private method
    private void displayPrivate() {
        System.out.println("This is a private method. Name: " + name);
    }

    // public method to access private method
    public void showDetails() {
        displayPrivate(); // Valid: called within the same class
    }
}

// Another class trying to access private members
class AccessModifierDemo {
    public static void main(String[] args) {
        AccessPrivate p = new AccessPrivate();

        // p.name = "Bob";             //  Error: name has private access
        // p.displayPrivate();         //  Error: displayPrivate() has private access

        p.showDetails();               //   This works, accesses private method indirectly
    }
}
