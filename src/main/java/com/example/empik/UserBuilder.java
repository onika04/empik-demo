package com.example.empik;

import com.example.empik.domain.GithubUser;
import com.example.empik.domain.User;

import java.time.Instant;

public interface UserBuilder {
    void setId(Integer id);
    void setLogin(String login);
    void setName(String name);
    void setType (String type);
    void setAvatarUrl(String avatarUrl);
    void setCreatedAt(Instant createdAt);
    void setFollowers(Integer followers);
    void setPublic_repos(Integer public_repos);
    void setCalculations(Integer calculations);
    GithubUser gitHubUserBuild();
    User userBuild();
}
