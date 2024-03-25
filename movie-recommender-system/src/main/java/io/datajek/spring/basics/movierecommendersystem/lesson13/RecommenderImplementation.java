package io.datajek.spring.basics.movierecommendersystem.lesson13;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class RecommenderImplementation {
    //use filter interface to select filter
    @Inject
    @Qualifier("CF")
    private Filter filter;

    public Filter getFilter(){
        return filter;
    }

    //use a filter to find recommendations
    public String[] recommendMovies(String movie){
        //return the results
        return filter.getRecommendations(movie);
        //return filter.getRecommendations("Finding Dory");
    }
}
