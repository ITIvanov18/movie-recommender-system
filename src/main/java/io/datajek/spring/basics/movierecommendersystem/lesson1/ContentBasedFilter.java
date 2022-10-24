package io.datajek.spring.basics.movierecommendersystem.lesson1;

import java.util.logging.Filter;

public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String  movie){

        //return movie recommendations
        return new String[] {"Happy feet", "Ice Age", "Shark Tale"};
    }


}
