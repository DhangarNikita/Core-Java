package ThisKey;

public class Book {
    String title;

    // Constructor
    Book(String title) {
        this.title = title;
    }

    // Method that returns the current object
    Book getSelf() {
        return this;
    }

    public static void main(String[] args) {
        Book myBook = new Book("Java Programming");
       // Book returnedBook = myBook.getSelf();
        System.out.println(myBook.getSelf());

        // Print title using the returned reference
      //  System.out.println("Book title: " + returnedBook.title);
        System.out.println(myBook.title);
    }
}
