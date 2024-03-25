package io.datajek.spring.basics.movierecommendersystem.lesson12;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

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
