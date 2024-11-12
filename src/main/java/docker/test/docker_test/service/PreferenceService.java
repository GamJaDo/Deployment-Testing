package docker.test.docker_test.service;

import docker.test.docker_test.dto.PreferenceRequest;
import docker.test.docker_test.entity.BodyInfo;
import docker.test.docker_test.entity.Preference;
import docker.test.docker_test.entity.Sports;
import docker.test.docker_test.entity.User;
import docker.test.docker_test.repository.BodyInfoRepository;
import docker.test.docker_test.repository.PreferenceRepository;
import org.springframework.stereotype.Service;

@Service
public class PreferenceService {

    private final PreferenceRepository preferenceRepository;
    private final UserService userService;
    private final SportsService sportsService;
    private final BodyInfoRepository bodyInfoRepository;

    public PreferenceService(PreferenceRepository preferenceRepository, UserService userService,
                             SportsService sportsService, BodyInfoRepository bodyInfoRepository){
        this.preferenceRepository = preferenceRepository;
        this.userService = userService;
        this.sportsService = sportsService;
        this.bodyInfoRepository = bodyInfoRepository;
    }

    public void registerPreference(Long userId, PreferenceRequest request) {
        User user = userService.getUser(userId);
        Sports sports = sportsService.getSportsById(request.sportsId());
        BodyInfo bodyInfo = getLastBodyInfo(user);
        Preference preference = request.toEntity(user, bodyInfo, sports);
        preferenceRepository.save(preference);
    }

    private BodyInfo getLastBodyInfo(User user) {
        return bodyInfoRepository.findTopByUserOrderByCreateDateDesc(user)
                .orElseThrow(() -> new RuntimeException("not.found.bodyinfo"));
    }
}
