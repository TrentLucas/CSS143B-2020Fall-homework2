package Problem3;

import java.util.UUID;

public abstract class Movie implements StoreMediaOperations {
    String rating;
    String title;
    UUID id;

    //Added this constructor for the sub classes of Movie to work
    public Movie() {
        this.id = UUID.randomUUID();
    }

    public Movie(String rating, String title) {
        this.id = UUID.randomUUID();
        // homework
        this.rating = rating;
        this.title = title;
    }

    public Movie(Movie anotherMovie) {
        // homework
        this.id = UUID.randomUUID();
        this.rating = anotherMovie.rating;
        this.title = anotherMovie.title;
    }

    @Override
    public boolean equals(Object obj) {
        // homework
        if (obj == null || !(obj instanceof Movie)) {
            return false;
        }
        Movie that = (Movie) obj;
        System.out.println(that.id + "   " + this.id);
        if (that.id == this.id) {
            return true;
        } else {
            return false;
        }
    }
}
