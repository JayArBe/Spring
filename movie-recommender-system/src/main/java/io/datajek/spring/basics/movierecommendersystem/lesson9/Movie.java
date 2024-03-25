package io.datajek.spring.basics.movierecommendersystem.lesson9;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Movie {
    //for keeping track of instances created
    private static int instances = 0;

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
