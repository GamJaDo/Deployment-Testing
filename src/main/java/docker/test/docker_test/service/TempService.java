package docker.test.docker_test.service;

import docker.test.docker_test.entity.Number;
import docker.test.docker_test.repository.TempRepository;
import org.springframework.stereotype.Service;

@Service
public class TempService {

    private final TempRepository tempRepository;

    public TempService(TempRepository tempRepository){
        this.tempRepository = tempRepository;
    }

    public void addNum(){
        Number number = new Number();
        number.addTempNum();
        tempRepository.save(number);
    }
}
