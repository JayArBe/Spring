package io.datajek.springaop.movierecommenderaop.business;

import io.datajek.springaop.movierecommenderaop.MeasureTime;
import io.datajek.springaop.movierecommenderaop.data.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilteringTechnique1 {
    @Autowired
    private Movie movie;
    /*
    public String contentBasedFiltering(){
        return movie.getMovieDetails();
    }*/


    @MeasureTime
    public String contentBasedFiltering() {
        return movie.getMovieDetails();
    }

}
