package docker.test.docker_test.dto;

import docker.test.docker_test.entity.BodyInfo;
import docker.test.docker_test.entity.Preference;
import docker.test.docker_test.entity.Sports;
import docker.test.docker_test.entity.User;
import docker.test.docker_test.status.TrainerGender;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record  PreferenceRequest(@NotNull Long sportsId,
                                 TrainerGender gender, @NotNull @Positive int range, String goal) {
    public Preference toEntity(User user, BodyInfo bodyInfo, Sports sports) {
        return new Preference(user, bodyInfo, sports, gender, range, goal);
    }
}
