package io.datajek.spring.basics.movierecommendersystem.lesson15;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		// ApplicationContext manages the beans and dependencies
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext15.xml");

		//check the beans which have been loaded
		System.out.println("\nBeans loaded:");
		System.out.println(Arrays.toString(appContext.getBeanDefinitionNames()));

		//retrieve bean from the application context
		RecommenderImplementation recommender =
				appContext.getBean("recommenderImplementation", RecommenderImplementation.class);
		//print dependency
		System.out.println("\nDependency: " + recommender.getFilter());
		System.out.println();

		appContext.close();

	}

}
