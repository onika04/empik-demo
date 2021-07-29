package com.example.empik.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.Instant;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GithubUser {
    private String login;
    private String name;
    private String type;
    private String avatar_url;
    private Instant created_at;
    private int followers;
    private int public_repos;

    public GithubUser() {
    }

    public GithubUser(String login, String name, String type, String avatar_url, Instant created_at, Integer followers, Integer public_repos) {
        this.login = login;
        this.name = name;
        this.type = type;
        this.avatar_url = avatar_url;
        this.created_at = created_at;
        this.followers = followers;
        this.public_repos = public_repos;
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
        return avatar_url;
    }

    public void setAvatarUrl(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public Instant getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(Instant created_at) {
        this.created_at = created_at;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getPublic_repos() {
        return public_repos;
    }

    public void setPublic_repos(int public_repos) {
        this.public_repos = public_repos;
    }

    @Override
    public String toString() {
        return "GithubUser{" +
                ", login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", avatarUrl='" + avatar_url + '\'' +
                ", createdAt=" + created_at +
                ", followers=" + followers +
                ", public_repos=" + public_repos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GithubUser that = (GithubUser) o;
        return Objects.equals(login, that.login) && Objects.equals(name, that.name) && Objects.equals(type, that.type) && Objects.equals(avatar_url, that.avatar_url) && Objects.equals(created_at, that.created_at) && Objects.equals(followers, that.followers) && Objects.equals(public_repos, that.public_repos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, name, type, avatar_url, created_at, followers, public_repos);
    }
}
