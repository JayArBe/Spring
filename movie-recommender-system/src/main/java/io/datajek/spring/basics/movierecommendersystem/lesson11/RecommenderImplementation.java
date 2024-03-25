package io.datajek.spring.basics.movierecommendersystem.lesson11;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    //use filter interface to select filter
    private Filter filter;
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    public void setFilter(Filter filter){
        logger.info("In RecommenderImplementation setter method..dependency injection");
        this.filter = filter;
    }

    @PostConstruct
    public void postConstruct() {
        //initialization code goes here
        logger.info("In RecommenderImplementation postConstruct method");
    }

    @PreDestroy
    public void preDestroy(){
        //cleanup code
        logger.info("In RecommenderImplementation preDestroy method");
    }

    //use a filter to find recommendations
    public String[] recommendMovies(String movie){
        //return the results
        return filter.getRecommendations(movie);
        //return filter.getRecommendations("Finding Dory");
    }
}
