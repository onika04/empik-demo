package com.example.empik.domain;

import java.time.Instant;

public interface UserBuilder {
    void setLogin(String login);

    void setName(String name);

    void setType(String type);

    void setAvatarUrl(String avatarUrl);

    void setCreatedAt(Instant createdAt);

    void setFollowers(int followers);

    void setPublic_repos(int public_repos);

    void setCalculations(double calculations);

    GithubUser gitHubUserBuild();

    User userBuild();
}
