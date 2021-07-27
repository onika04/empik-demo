package com.example.empik;

import com.example.empik.database.UsersRepository;
import com.example.empik.database.UsersTable;
import com.example.empik.domain.GithubUser;
import com.example.empik.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UsersRepository repository;
    private final GithubClient client;
    private final UserMapper mapper;

    public UserService(UsersRepository repository, GithubClient client) {
        this.repository = repository;
        this.client = client;
        this.mapper = new UserMapper();
    }

    public User updateCountCalculation(String login) {
        GithubUser githubUser = client.getDataFromGithub(login);
        Integer calculate = calculate(githubUser.getFollowers(), githubUser.getPublic_repos());
        insertOrUpdateRequestCount(login);

        return mapper.mapToUser(githubUser, calculate);
    }


    private void insertOrUpdateRequestCount(String login) {
        UsersTable userTable = repository.findUsersByLogin(login);
        UsersTable userToSave;
        if (userTable == null) {
            userToSave = new UsersTable(login, 1);
        } else {
            long incrementCount = userTable.getRequest_count() + 1;
            userToSave = new UsersTable(login, incrementCount);
        }
        repository.save(userToSave);
    }

    private Integer calculate(Integer followers, Integer public_repos) {
        return 6 / followers * (2 + public_repos);
    }
}
