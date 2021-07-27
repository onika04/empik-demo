package com.example.empik.api;


import com.example.empik.GithubClient;
import com.example.empik.UserService;
import com.example.empik.database.UsersRepository;
import com.example.empik.database.UsersTable;
import com.example.empik.domain.GithubUser;
import com.example.empik.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserEndpoint {
    private final GithubClient client;
    private final UserService service;

    public UserEndpoint(GithubClient client, UserService service) {
        this.client = client;
        this.service = service;
    }

    @GetMapping("/{login}")
    public User getUserByLogin(@PathVariable String login) {
        return service.updateCountCalculation(login);
    }


    @GetMapping("/nic")
    public GithubUser getUserByLogin() {
        return client.getDataFromGithub("octocat");
    }
}
