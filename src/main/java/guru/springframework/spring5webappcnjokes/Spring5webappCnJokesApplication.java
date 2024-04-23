package guru.springframework.spring5webappcnjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
//@ComponentScan(basePackages = {"guru.springframework.spring5webappcnjokes", "guru.springframework.norris.chuck"})
public class Spring5webappCnJokesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5webappCnJokesApplication.class, args);
//		ChuckNorrisQuotes cnq = new ChuckNorrisQuotes();
//		System.out.println(cnq.getRandomQuote());
//		System.out.println(cnq.getRandomQuote());
//		System.out.println(cnq.getRandomQuote());
//		System.out.println(cnq.getRandomQuote());
//		System.out.println(cnq.getRandomQuote());
	}

}
