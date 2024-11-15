package docker.test.docker_test.entity;

import docker.test.docker_test.status.TrainerGender;
import jakarta.persistence.*;

@Entity
@Table(name = "PREFERENCE_TB")
public class Preference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToOne
    @JoinColumn(name = "bodyInfo_id", nullable = false)
    private BodyInfo bodyInfo;

    @ManyToOne
    @JoinColumn(name = "sports_id", nullable = false)
    private Sports sports;

    @Enumerated(EnumType.STRING)
    private TrainerGender gender;

    @Column(name = "`range`", nullable = false)
    private int range;

    @Column(nullable = false)
    private String goal;

    public Preference(User user, BodyInfo bodyInfo, Sports sports, TrainerGender gender, int range,
                      String goal) {
        this.user = user;
        this.bodyInfo = bodyInfo;
        this.sports = sports;
        this.gender = gender;
        this.range = range;
        this.goal = goal;
    }

    protected Preference() {
    }

    public int getRange() {
        return range;
    }

    public User getUser() {
        return user;
    }

    public boolean isValidTrainerGender(TrainerGender gender) {
        if (this.gender == null) {
            return true;
        }
        return this.gender.equals(gender);
    }

    /*
    public PreferenceResponse toDto() {
        return new PreferenceResponse(user.getId(), user.getName(),
                bodyInfo.getInbodyImageUrl(), goal, user.getProfileImageUrl());
    }
     */
}

