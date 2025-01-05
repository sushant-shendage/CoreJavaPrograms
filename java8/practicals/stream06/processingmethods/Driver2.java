// package java8.practicals.stream06.concept;

import java.util.ArrayList;
import java.util.List;

public class Driver2 {
    public static void main(String[] args) {
        List <Movie> movieList1=new ArrayList<>();
        movieList1.add(new Movie("m1", "l1", 7.5, 2.5));
        movieList1.add(new Movie("m2", "l1", 5.5, 3));
        movieList1.add(new Movie("m3", "l2", 7.0, 1.5));
        movieList1.add(new Movie("m4", "l3", 9.0, 3));
        movieList1.add(new Movie("m5", "l2", 6.5, 2.5));
        
        movieList1.stream().map(n->{n.movieName=n.movieName.toUpperCase();
            return n;
        } ).forEach(System.out::println);
    }
}
class Movie{
    String movieName;
    String language;
    double rating;
    double duration;
    public Movie(String movieName, String language, double rating, double duration) {
        this.movieName = movieName;
        this.language = language;
        this.rating = rating;
        this.duration = duration;
    }
    @Override
    public String toString() {
        return "Movie [movieName=" + movieName + ", language=" + language + ", rating=" + rating + ", duration="
                + duration + "]";
    }

    

    
}