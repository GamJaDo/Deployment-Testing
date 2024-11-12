package docker.test.docker_test.controller;

import docker.test.docker_test.dto.PreferenceRegistrationRequest;

import docker.test.docker_test.service.PreferenceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/preferences")
public class PreferenceController {

    private final PreferenceService preferenceService;

    public PreferenceController(PreferenceService preferenceService) {
        this.preferenceService = preferenceService;
    }

    @PostMapping
    public ResponseEntity<Void> registerPreference(@RequestBody PreferenceRegistrationRequest request) {
        preferenceService.registerPreference(request.token().id(), request.preferenceRequest());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
