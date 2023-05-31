package hibernate.assignment.one.repository;

import hibernate.assignment.one.entity.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepo extends JpaRepository<Director, Integer> {

}
