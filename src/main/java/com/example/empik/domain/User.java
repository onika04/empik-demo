package com.example.empik.domain;

import java.time.Instant;

public class User {
    private Integer id;
    private String login;
    private String name;
    private String type;
    private String avatarUrl;
    private Instant createdAt;
    private Long calculations;


    public User() {}

    public User(Integer id, String login, String name, String type, String avatarUrl, Instant createdAt, Long calculations) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.type = type;
        this.avatarUrl = avatarUrl;
        this.createdAt = createdAt;
        this.calculations = calculations;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Long getCalculations() {
        return calculations;
    }

    public void setCalculations(Long calculations) {
        this.calculations = calculations;
    }



}
