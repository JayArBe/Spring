package io.datajek.spring.basics.movierecommendersystem.lesson14;


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
