package docker.test.docker_test.repository;

import docker.test.docker_test.entity.Sports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportsRepository extends JpaRepository<Sports, Long> {

    //boolean existsByName(String name);
}
