package Problem3;

import java.util.UUID;

public class BookRomance extends Book {

    private int lateFeePerDayInDollar = 4;

    public BookRomance(String title, String author) {
        // homework
        // tip: use the 'super' keyword
        super.title = title;
        super.author = author;
        super.id = UUID.randomUUID();
    }

    public BookRomance(BookRomance anotherBook) {
        // homework
        // tip: use the 'super' keyword
        super.title = anotherBook.title;
        super.author = anotherBook.author;
        super.id = UUID.randomUUID();
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
