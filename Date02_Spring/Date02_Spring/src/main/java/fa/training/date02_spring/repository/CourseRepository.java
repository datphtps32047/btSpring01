package fa.training.date02_spring.repository;

import fa.training.date02_spring.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>  {
}
