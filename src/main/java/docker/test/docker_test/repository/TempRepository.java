package docker.test.docker_test.repository;

import docker.test.docker_test.entity.Number;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TempRepository extends JpaRepository<Number, Long> {

}
