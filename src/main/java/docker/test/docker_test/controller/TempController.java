package docker.test.docker_test.controller;

import docker.test.docker_test.service.TempService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {

    private final TempService tempService;

    public TempController(TempService tempService){
        this.tempService = tempService;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> printHello(){
        return ResponseEntity.status(HttpStatus.OK).body("hello1");
    }

    @PostMapping("/add")
    public ResponseEntity<String> add(){
        tempService.addNum();
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
