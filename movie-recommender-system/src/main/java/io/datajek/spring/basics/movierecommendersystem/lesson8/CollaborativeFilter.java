package io.datajek.spring.basics.movierecommendersystem.lesson8;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
