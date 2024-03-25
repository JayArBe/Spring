package springdata.tennisplayer.JPQL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;


@SpringBootApplication
public class TennisPlayerApplication implements CommandLineRunner {

	/*
	@Autowired
    PlayerRepository repo;
*/

	@Autowired
	PlayerSpringDataRepository repo;
	private Logger logger = LoggerFactory.getLogger(this.getClass());


	@Override
	public void run(String... args) throws Exception {
		/*
		//Inserting rows
		logger.info("Inserting Player: {}", repo.save(new Player("Djokovic", "Serbia",
				Date.valueOf("1987-05-22"), 81)));
		logger.info("Inserting Player: {}", repo.save(new Player("Monfils", "France",
				Date.valueOf("1986-09-01"), 10)));
		logger.info("Inserting Player: {}", repo.save(new Player("Thiem", "Austria",
				new Date(System.currentTimeMillis()), 17)));

		//Updating row
		logger.info("Updating Player with Id 3: {}", repo.save(
				new Player(3, "Thiem", "Austria", Date.valueOf("1993-09-03"), 17)));

		//findById
		logger.info("Player with Id 2: {}", repo.findById(2));

		//findAll
		logger.info("All Players Data: {}", repo.findAll());

		//deleteById
		repo.deleteById(2);*/



		logger.info("\n\n>>Inserting Player: {}\n", repo.save(new Player("Djokovic", "Serbia", Date.valueOf("1987-05-22"), 81)));
		logger.info("\n\n>>Inserting Player: {}\n", repo.save(new Player("Monfils", "France", Date.valueOf("1986-09-01"), 10)));
		logger.info("\n\n>>Inserting Player: {}\n", repo.save(new Player("Thiem", "Austria", new Date(System.currentTimeMillis()), 17)));
		logger.info("\n\n>>Updating Player with Id 3: {}\n", repo.save(new Player(3, "Thiem", "Austria", Date.valueOf("1993-09-03"), 17)));
		logger.info("\n\n>>Player with Id 2: {}\n", repo.findById(2));
		repo.deleteById(2);
		logger.info("\n\n>>All Players Data: {}\n", repo.findAll());
	}

	public static void main(String[] args) {
		SpringApplication.run(TennisPlayerApplication.class, args);
	}



}

