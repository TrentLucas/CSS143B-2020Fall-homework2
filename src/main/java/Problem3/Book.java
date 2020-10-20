package Problem3;

import java.util.UUID;

public abstract class Book implements StoreMediaOperations {
    UUID id;
    String title;
    String author;

    //Added this constructor for the sub classes of Book to work
    public Book() {
        this.id = UUID.randomUUID();
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.id = UUID.randomUUID();
    }

    // copy constructor
    public Book(Book anotherBook) {
        // homework
        this.title = anotherBook.title;
        this.author = anotherBook.author;
        this.id = anotherBook.id;
    }

    @Override
    public boolean equals(Object obj) {
        // homework
        if (obj == null || !(obj instanceof Book)) {
            return false;
        }
        Book that = (Book) obj;
        if (that.id == this.id) {
            return true;
        } else {
            return false;
        }
    }
}