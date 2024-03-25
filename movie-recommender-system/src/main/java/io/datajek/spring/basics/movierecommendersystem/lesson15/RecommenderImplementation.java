package io.datajek.spring.basics.movierecommendersystem.lesson15;

import org.springframework.beans.factory.annotation.Autowired;
//old import org.springframework.beans.factory.annotation.Qualifier;

public class RecommenderImplementation {
    //use filter interface to select filter

    @Autowired
    private Filter filter;

    public Filter getFilter(){
        return filter;
    }

    public void setFilter(Filter filter){
        this.filter=filter;
    }


    //use a filter to find recommendations
    public String[] recommendMovies(String movie){
        //use content based filter to find similar movies
        System.out.println("Name of the filter in use: " + filter + "\n");
        //return the results
        return filter.getRecommendations(movie);
        //return filter.getRecommendations("Finding Dory");
    }
}
