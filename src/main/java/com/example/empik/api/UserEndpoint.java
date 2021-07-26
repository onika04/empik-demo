package com.example.empik.api;


import com.example.empik.database.UsersRepository;
import com.example.empik.database.UsersTable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserEndpoint {
    private final UsersRepository repository;

    public UserEndpoint(UsersRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{login}")
    public UsersTable getUserByLogin(@PathVariable String login) {
    return repository.findUsersByLogin(login);
    }


    @GetMapping("/nic")
    public UsersTable getUserByLogin() {
        return repository.findUsersByLogin("John");
    }
}
