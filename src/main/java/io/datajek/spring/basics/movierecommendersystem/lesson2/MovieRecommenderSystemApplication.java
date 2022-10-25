package io.datajek.spring.basics.movierecommendersystem;
import io.datajek.spring.basics.movierecommendersystem.lesson1.ContentBasedFilter;
import io.datajek.spring.basics.movierecommendersystem.lesson1.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;


    public static void main(String[] args) {
        
         ApplicationContext appContext = 
             SpringApplication.run(MovieRecommenderSystemApplication.class, args);

        RecommenderImplementation recommender = 
            appContext.getBean(RecommenderImplementation.class);

        //call method to get recommendations
        String[] result = recommender.recommendMovies("Finding Dory");

        //display results
        System.out.println(Arrays.toString(result));
    }

}
