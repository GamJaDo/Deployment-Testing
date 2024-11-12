package docker.test.docker_test.repository;

import docker.test.docker_test.entity.BodyInfo;
import docker.test.docker_test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BodyInfoRepository extends JpaRepository<BodyInfo, Long> {

    //Page<BodyInfo> findAllByUser(User user, Pageable pageable);

    Optional<BodyInfo> findTopByUserOrderByCreateDateDesc(User user);

}
