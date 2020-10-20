package Problem3;

import java.util.UUID;

public class BookFiction extends Book {

    private int lateFeePerDayInDollar = 2;

    private String genres;

    public BookFiction(String title, String author, String genres) {
        // homework
        // tip: use the 'super' keyword
        super.title = title;
        super.author = author;
        super.id = UUID.randomUUID();
        this.genres = genres;
    }

    // copy constructor
    public BookFiction(BookFiction anotherBook) {
        // homework
        // tip: use the 'super' keyword
        super.title = anotherBook.title;
        super.author = anotherBook.author;
        super.id = UUID.randomUUID();
        this.genres = anotherBook.genres;
    }

    @Override
    public int getLateFeeInDollar() {
        return lateFeePerDayInDollar;
    }

    @Override
    public int calcLateFees(int numOfDaysPastDue) {
        // homework
        return numOfDaysPastDue * lateFeePerDayInDollar;
    }
}
