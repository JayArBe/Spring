package io.datajek.spring.basics.movierecommendersystem.lesson3To6;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie){
        //logic of collaborative filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
