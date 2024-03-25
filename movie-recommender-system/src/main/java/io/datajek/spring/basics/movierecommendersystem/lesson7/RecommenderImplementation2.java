package io.datajek.spring.basics.movierecommendersystem.lesson7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {
    //use filter interface to select filter
    private Filter filter;

    @Autowired
    @Qualifier("contentBasedFilter")
    public void setFilter(Filter filter) {
        this.filter = filter;
        System.out.println("Setter method invoked..");
    }

    public RecommenderImplementation2(@Qualifier("collaborativeFilter") Filter filter){
        this.filter = filter;
        System.out.println("Constructor invoked...");
    }

    //use a filter to find recommendations
    public String[] recommendMovies(String movie){
        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + filter + "\n");
        //return the results
        return filter.getRecommendations(movie);
    }
}
