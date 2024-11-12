package docker.test.docker_test.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

@Entity
@Table(name = "SPORTS_TB")
@SQLDelete(sql = "UPDATE sports SET deleted = true WHERE id = ?")
@SQLRestriction("deleted = false")
public class Sports {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private final boolean deleted = Boolean.FALSE;

    protected Sports() {
    }

    public Sports(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
/*
    public void rename(SportsRequest request) {
        this.name = request.name();
    }

    public SportsResponse toDto() {
        return new SportsResponse(id, name);
    }
 */
}
