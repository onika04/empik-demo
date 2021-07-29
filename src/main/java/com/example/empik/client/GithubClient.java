package com.example.empik.client;

import com.example.empik.domain.GithubUser;

public interface GithubClient {
    GithubUser getDataFromGithub(String login);
}
