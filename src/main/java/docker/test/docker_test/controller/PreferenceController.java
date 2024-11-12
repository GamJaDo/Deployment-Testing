package docker.test.docker_test.controller;

import docker.test.docker_test.dto.PreferenceRequest;
import docker.test.docker_test.dto.Token;
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
    public ResponseEntity<Void> registerPreference(@RequestHeader("Authorization") Token token,
                                                   @RequestBody PreferenceRequest request) {
        preferenceService.registerPreference(token.id(), request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
