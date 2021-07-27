package com.example.empik.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.Instant;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GithubUser {
    private Integer id;
    private String login;
    private String name;
    private String type;
    private String avatarUrl;
    private Instant createdAt;
    private Integer followers;
    private Integer public_repos;


    public GithubUser(Integer id, String login, String name, String type, String avatarUrl, Instant createdAt, Integer followers, Integer public_repos) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.type = type;
        this.avatarUrl = avatarUrl;
        this.createdAt = createdAt;
        this.followers = followers;
        this.public_repos = public_repos;
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


    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Integer getPublic_repos() {
        return public_repos;
    }

    public void setPublic_repos(Integer public_repos) {
        this.public_repos = public_repos;
    }

    @Override
    public String toString() {
        return "GithubUser{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", createdAt=" + createdAt +
                ", followers=" + followers +
                ", public_repos=" + public_repos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GithubUser that = (GithubUser) o;
        return Objects.equals(id, that.id) && Objects.equals(login, that.login) && Objects.equals(name, that.name) && Objects.equals(type, that.type) && Objects.equals(avatarUrl, that.avatarUrl) && Objects.equals(createdAt, that.createdAt) && Objects.equals(followers, that.followers) && Objects.equals(public_repos, that.public_repos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, name, type, avatarUrl, createdAt, followers, public_repos);
    }
}
