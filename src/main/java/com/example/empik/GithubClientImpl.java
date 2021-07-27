package com.example.empik;

import com.example.empik.domain.GithubUser;
import com.example.empik.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GithubClientImpl implements GithubClient{
    private static final String GITHUB_URI = "https://api.github.com/users/";

    @Autowired
    RestTemplate restTemplate;

    @Override
    public GithubUser getDataFromGithub(String login) {
        String url = GITHUB_URI + login;
        return restTemplate.getForEntity(url, User.class).getBody();
    }
}
