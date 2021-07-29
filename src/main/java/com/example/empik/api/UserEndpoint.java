package com.example.empik.api;


import com.example.empik.UserService;
import com.example.empik.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserEndpoint {
    private final UserService service;

    public UserEndpoint(UserService service) {
        this.service = service;
    }

    @GetMapping("/{login}")
    public User getUserByLogin(@PathVariable String login) {
        return service.updateCountCalculation(login);
    }
}
