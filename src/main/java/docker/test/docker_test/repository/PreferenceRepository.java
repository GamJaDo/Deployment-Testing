package docker.test.docker_test.repository;

import docker.test.docker_test.entity.Preference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreferenceRepository extends JpaRepository<Preference, Long> {

    //void deleteByUser(User user);
}
