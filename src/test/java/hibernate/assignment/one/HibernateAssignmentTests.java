package hibernate.assignment.one;

import hibernate.assignment.one.entity.Director;
import hibernate.assignment.one.entity.Movie;
import hibernate.assignment.one.repository.DirectorRepo;
import hibernate.assignment.one.repository.MovieRepo;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class HibernateAssignmentTests {

	@Autowired
	MovieRepo movieRepo;

	@Autowired
	DirectorRepo directorRepo;

	@Test
	void contextLoads() {
	}

	@Test
	@Transactional
	public void showMoviesData(){
		List<Movie> movieList = movieRepo.findAll();
		movieList.forEach(movie -> log.info(movie.toString()));
	}

	@Test
	@Transactional
	public void showDirectorsData(){
		List<Director> directorList = directorRepo.findAll();
		directorList.forEach(director -> log.info(director.toString()));
	}
}
