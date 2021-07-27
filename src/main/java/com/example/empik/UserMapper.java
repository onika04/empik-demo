package com.example.empik;

import com.example.empik.domain.GithubUser;
import com.example.empik.domain.User;

public class UserMapper {

    User mapToUser(GithubUser githubUser, Integer calculation) {
        UserBuilder builder  = new UserBuilderImpl();
        builder.setId(githubUser.getId());
        builder.setLogin(githubUser.getLogin());
        builder.setName(githubUser.getName());
        builder.setType(githubUser.getType());
        builder.setAvatarUrl(githubUser.getAvatarUrl());
        builder.setCreatedAt(githubUser.getCreatedAt());
        builder.setCalculations(calculation);
       return builder.userBuild();
    }

    GithubUser mapToGithubUser(User user, Integer followers, Integer public_repos) {
        UserBuilder builder  = new UserBuilderImpl();
        builder.setId(user.getId());
        builder.setLogin(user.getLogin());
        builder.setName(user.getName());
        builder.setType(user.getType());
        builder.setAvatarUrl(user.getAvatarUrl());
        builder.setCreatedAt(user.getCreatedAt());
        builder.setFollowers(followers);
        builder.setPublic_repos(public_repos);
        return builder.gitHubUserBuild();
    }

}
