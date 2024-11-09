package docker.test.docker_test.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Numbers")
public class Number {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int tempNum = 0;

    public int getTempNum(){
        return tempNum;
    }

    public void addTempNum(){
        this.tempNum += 1;
    }
}
