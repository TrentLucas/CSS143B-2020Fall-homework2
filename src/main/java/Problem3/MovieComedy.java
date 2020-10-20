package Problem3;

import java.util.UUID;

public class MovieComedy extends Movie {
    private int lateFeePerDayInDollar = 3;

    public MovieComedy(String rating, String title) {
        // homework
        // tip: use the 'super' keyword
        super.title = title;
        super.rating = rating;
        super.id = UUID.randomUUID();
    }

    public MovieComedy(MovieComedy anotherMovie) {
        // homework
        // tip: use the 'super' keyword
        super.title = anotherMovie.title;
        super.rating = anotherMovie.rating;
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
