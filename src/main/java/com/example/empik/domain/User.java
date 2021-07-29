package com.example.empik.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.Instant;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private String login;
    private String name;
    private String type;
    private String avatarUrl;
    private Instant createdAt;
    private double calculations;


    public User() {
    }

    public User(String login, String name, String type, String avatarUrl, Instant createdAt, double calculations) {
        this.login = login;
        this.name = name;
        this.type = type;
        this.avatarUrl = avatarUrl;
        this.createdAt = createdAt;
        this.calculations = calculations;
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

    public double getCalculations() {
        return calculations;
    }

    public void setCalculations(double calculations) {
        this.calculations = calculations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(name, user.name) && Objects.equals(type, user.type) && Objects.equals(avatarUrl, user.avatarUrl) && Objects.equals(createdAt, user.createdAt) && Objects.equals(calculations, user.calculations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, name, type, avatarUrl, createdAt, calculations);
    }

    @Override
    public String toString() {
        return "User{" +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", createdAt=" + createdAt +
                ", calculations=" + calculations +
                '}';
    }
}
