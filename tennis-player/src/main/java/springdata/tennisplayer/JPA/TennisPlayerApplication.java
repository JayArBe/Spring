package springdata.tennisplayer.JPA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;


@SpringBootApplication
public class TennisPlayerApplication implements CommandLineRunner {

	@Autowired
	PlayerRepository repo;

	private Logger logger = LoggerFactory.getLogger(this.getClass());


	@Override
	public void run(String... args) throws Exception {
		//insert players
		logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(
				new Player("Djokovic", "Serbia", Date.valueOf("1987-05-22"), 81)));
		logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(
				new Player("Monfils", "France", Date.valueOf("1986-09-01"), 10)));
		logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(
				new Player("Thiem", "Austria",
						new Date(System.currentTimeMillis()), 17)));
		//update player
		logger.info("\n\n>> Updating Player with Id 3: {}\n", repo.updatePlayer(
				new Player(3, "Thiem", "Austria", Date.valueOf("1993-09-03"), 17)));
		//get player
		logger.info("\n\n>> Player with id 3: {}\n", repo.getPlayerById(3));
		//delete player
		repo.deletePlayerById(2);
	}

	public static void main(String[] args) {
		SpringApplication.run(TennisPlayerApplication.class, args);
	}



}

