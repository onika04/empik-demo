package com.example.empik.domain;

import java.time.Instant;

public class UserBuilderImpl implements UserBuilder {
    private String login;
    private String name;
    private String type;
    private String avatarUrl;
    private Instant createdAt;
    private int followers;
    private int public_repos;
    private double calculations;

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @Override
    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public void setFollowers(int followers) {
        this.followers = followers;
    }

    @Override
    public void setPublic_repos(int public_repos) {
        this.public_repos = public_repos;
    }

    @Override
    public void setCalculations(double calculations) {
        this.calculations = calculations;
    }

    @Override
    public GithubUser gitHubUserBuild() {
        return new GithubUser(login, name, type, avatarUrl, createdAt, followers, public_repos);
    }

    @Override
    public User userBuild() {
        return new User(login, name, type, avatarUrl, createdAt, calculations);
    }
}
