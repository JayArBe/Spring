package io.datajek.springaop.movierecommenderaop.data;

import io.datajek.springaop.movierecommenderaop.MeasureTime;
import org.springframework.stereotype.Repository;

@Repository
public class Movie {
    /*
    public String getMovieDetails(){
        //interacts with the Movie repository
        return "movie details";
    }*/

    @MeasureTime
    public String getMovieDetails() {
        return "movie details";
    }
}
