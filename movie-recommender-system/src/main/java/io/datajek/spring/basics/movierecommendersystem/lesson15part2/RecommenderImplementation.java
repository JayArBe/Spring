package io.datajek.spring.basics.movierecommendersystem.lesson15part2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    //use filter interface to select filter
    @Autowired
    private Filter filter;

    @Value("${recommender.implementation.favoriteMovie}")
    String favoriteMovie;

    public String getFavoriteMovie(){
        return favoriteMovie;
    }

    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }




    //use a filter to find recommendations
    public String[] recommendMovies(String movie){
        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter + "\n");
        //return the results
        return filter.getRecommendations(movie);
    }
}
