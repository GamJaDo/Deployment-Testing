package docker.test.docker_test.dto;

import docker.test.docker_test.status.Role;

public record Token(Role role, Long id) {
}
