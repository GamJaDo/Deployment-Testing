package docker.test.docker_test.repository;

import docker.test.docker_test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //boolean existsByEmail(String email);

    //Optional<User> findByEmail(String email);
}
