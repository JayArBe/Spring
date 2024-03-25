package io.datajek.spring.basics.movierecommendersystem.lesson11;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {
    //for keeping track of instances created
    private static int instances = 0;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private int id;
    private String name;
    private String genre;
    private String producer;

    public Movie(){
        instances++;
        System.out.println("Movie constructor called");
    }

    public double movieSimilarity(Movie movie1, Movie movie2){
        double similarity = 0.0;

        //if genres are same add 0.3 to similarity
        //get by id later
        if(movie1.getGenre().equals(movie2.getGenre())){
            similarity+=0.3;
        }
        //if producers are same add 0.5 to similarity
        if(movie1.getProducer().equals(movie2.getProducer())){
            similarity+=0.5;
        }

        return similarity;
    }

    @PostConstruct
    private void postConstruct(){
        //initialization code
        logger.info("In Movie postConstruct method");
    }

    @PreDestroy
    private void preDestroy(){
        //cleanup code
        logger.info("In Movie preDestroy method");
    }

    public static int getInstances() {
        return Movie.instances;
    }

    public static void setInstances(int instances) {
        Movie.instances = instances;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }


}
