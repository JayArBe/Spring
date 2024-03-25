package io.datajek.spring.basics.movierecommendersystem.lesson2;

import io.datajek.spring.basics.movierecommendersystem.lesson1.ContentBasedFilter;

public class RecommenderImplementation {
    //use filter interface to select filter
    private final Filter filter;

    public RecommenderImplementation(Filter filter){
        super();
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
