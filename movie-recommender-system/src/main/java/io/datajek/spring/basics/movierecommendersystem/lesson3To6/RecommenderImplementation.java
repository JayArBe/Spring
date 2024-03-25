package io.datajek.spring.basics.movierecommendersystem.lesson3To6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    //use filter interface to select filter
    @Autowired
    @Qualifier("CBF")
    private Filter filter;

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
