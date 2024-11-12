package docker.test.docker_test.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "USER_TB", indexes = @Index(name = "IDX_USER_EMAIL", columnList = "EMAIL"))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Column(name = "profile_image_url", nullable = true)
    private String profileImageUrl;

    @Column(nullable = false)
    private String location;

    protected User() {
    }

    public User(String email, String password, String name, String profileImageUrl,
                String location) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.profileImageUrl = profileImageUrl;
        this.location = location;
    }

    public User(String email, String password, String name, String location) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public String getPassword() {
        return password;
    }

    public String getLocation() {
        return location;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }
/*
    public void updateInfo(UserProfileRequest request) {
        name = request.name();
        location = request.location();
    }

    public UserProfileResponse toDto() {
        return new UserProfileResponse(getName(), getLocation(), getProfileImageUrl());
    }
*/
}
