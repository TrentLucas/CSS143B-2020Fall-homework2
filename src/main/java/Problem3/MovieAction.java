package Problem3;

import java.util.UUID;

public class MovieAction extends Movie {

    private int lateFeePerDayInDollar = 5;

    public MovieAction(String rating, String title) {
        // homework
        // tip: use the 'super' keyword
        super.title = title;
        super.rating = rating;
        super.id = UUID.randomUUID();
    }

    public MovieAction(MovieAction anotherMovie) {
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
        if (numOfDaysPastDue < 0) {
            numOfDaysPastDue = 0;
        }
        if(numOfDaysPastDue < 5) {
            return numOfDaysPastDue * lateFeePerDayInDollar;
        }
        else {
            return 2 * numOfDaysPastDue * lateFeePerDayInDollar;
        }
    }
}
