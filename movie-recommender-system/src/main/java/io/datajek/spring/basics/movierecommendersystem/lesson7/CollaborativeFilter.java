package io.datajek.spring.basics.movierecommendersystem.lesson7;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CF")
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie){
        //logic of collaborative filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
