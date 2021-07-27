package com.example.empik;

import com.example.empik.domain.GithubUser;
import com.example.empik.domain.User;

import java.time.Instant;

public class UserBuilderImpl implements UserBuilder {
    private Integer id;
    private String login;
    private String name;
    private String type;
    private String avatarUrl;
    private Instant createdAt;
    private Integer followers;
    private Integer public_repos;
    private Integer calculations;

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

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
    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    @Override
    public void setPublic_repos(Integer public_repos) {
        this.public_repos = public_repos;
    }

    @Override
    public void setCalculations(Integer calculations) {
    this.calculations = calculations;
    }

    @Override
    public GithubUser gitHubUserBuild() {
        return new GithubUser(id, login, name, type, avatarUrl, createdAt, followers, public_repos);
    }

    @Override
    public User userBuild() {
        return  new User(id, login, name, type, avatarUrl, createdAt, calculations);
    }
}
