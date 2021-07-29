package com.example.empik;

import com.example.empik.domain.GithubUser;
import com.example.empik.domain.User;
import com.example.empik.domain.UserBuilder;
import com.example.empik.domain.UserBuilderImpl;

public class UserMapper {

    User mapToUser(GithubUser githubUser, double calculation) {
        UserBuilder builder = new UserBuilderImpl();
        builder.setLogin(githubUser.getLogin());
        builder.setName(githubUser.getName());
        builder.setType(githubUser.getType());
        builder.setAvatarUrl(githubUser.getAvatarUrl());
        builder.setCreatedAt(githubUser.getCreatedAt());
        builder.setCalculations(calculation);
        return builder.userBuild();
    }
}
