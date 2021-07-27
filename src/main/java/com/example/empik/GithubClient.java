package com.example.empik;

import com.example.empik.domain.GithubUser;
import com.example.empik.domain.User;

public interface GithubClient {
    GithubUser getDataFromGithub(String login);
}
