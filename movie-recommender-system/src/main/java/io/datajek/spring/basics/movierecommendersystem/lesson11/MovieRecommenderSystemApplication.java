package io.datajek.spring.basics.movierecommendersystem.lesson11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		//ApplicationContext manages the beans and dependencies
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		//use ApplicationContext to get recommender object
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

		//first part of the lesson
		/*System.out.println();
		System.out.println();
		System.out.println();

		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");

		//display results
		System.out.println();
		System.out.println();
		System.out.println(Arrays.toString(result));*/

		//second part
		//Retrieving prototype bean from application context twice
		/*
		Movie m1 = appContext.getBean(Movie.class);
		System.out.println(m1);

		Movie m2 = appContext.getBean(Movie.class);
		System.out.println(m2);
		*/

		//third part

		System.out.println(recommender);

		//Retrieving prototype bean from application context twice
		System.out.println();
		Movie m1 = appContext.getBean(Movie.class);
		System.out.println(m1);

		System.out.println();
		Movie m2 = appContext.getBean(Movie.class);
		System.out.println(m2);

		System.out.println();
	}

}
