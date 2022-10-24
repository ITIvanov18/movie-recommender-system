
package io.datajek.spring.basics.movierecommendersystem.lesson1;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;

import java.util.logging.Filter;

public class RecommenderImplementation {

    //use filter interface to select filter
    private Filter filter;

    public RecommenderImplementation(ContentBasedFilter filter) {        super();        this.filter = filter;    }

    //use a filter to find recommendations
    public String[] recommendMovies(String movies) {        System.out.println("Name of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");

        return results;    }
}

