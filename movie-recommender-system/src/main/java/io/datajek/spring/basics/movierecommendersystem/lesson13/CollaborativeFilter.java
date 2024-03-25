package io.datajek.spring.basics.movierecommendersystem.lesson13;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Named;

@Named
@Qualifier("CF")
public class CollaborativeFilter implements Filter {

    public CollaborativeFilter() {
        super();
    }

    //getRecommendations takes a movie as an input and returns a list of similar movies
    public String[] getRecommendations(String movie){

        //implement logic of collaborative filter


        //logic of collaborative filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
