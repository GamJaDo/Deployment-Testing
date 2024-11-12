package docker.test.docker_test.service;

import docker.test.docker_test.entity.Sports;
import docker.test.docker_test.repository.SportsRepository;
import org.springframework.stereotype.Service;

@Service
public class SportsService {

    private final SportsRepository sportsRepository;

    public SportsService(SportsRepository sportsRepository) {
        this.sportsRepository = sportsRepository;
    }

    public Sports getSportsById(Long id) {
        return sportsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("not.found.sports"));
    }
}
