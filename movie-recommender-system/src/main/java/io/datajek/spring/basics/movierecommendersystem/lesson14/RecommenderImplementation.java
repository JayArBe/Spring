package io.datajek.spring.basics.movierecommendersystem.lesson14;

public class RecommenderImplementation {
    //use filter interface to select filter

    private Filter filter;

    public Filter getFilter(){
        return filter;
    }

    public void setFilter(Filter filter){
        this.filter=filter;
    }
    public RecommenderImplementation() {
    }

    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }

    //use a filter to find recommendations
    public String[] recommendMovies(String movie){
        //return the results
        return filter.getRecommendations(movie);
        //return filter.getRecommendations("Finding Dory");
    }
}
