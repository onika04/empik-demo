package com.example.empik;

import com.example.empik.database.UsersRepository;
import com.example.empik.database.UsersTable;
import com.example.empik.domain.GithubUser;
import com.example.empik.domain.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    private static final Instant now = Instant.now();
    @Mock
    private UsersRepository repository;
    @Mock
    private GithubClient client;
    UserService service;


    @BeforeEach
    void setUp() {
        service = new UserService(repository, client);
    }

    @Test
    void shouldUpdateCountAndReturnUserData() {
        //given
        String login = "anyLogin";
        User newUser = createUser(login);
        GithubUser githubUser =  createGithubUser(login);
        UsersTable usersTable = new UsersTable(login, 1);
        when(client.getDataFromGithub(login)).thenReturn(githubUser);
        when(repository.findUsersByLogin(login)).thenReturn(usersTable);

        //when
        User user = service.updateCountCalculation(login);

        //then
        assertEquals(user, newUser);
        verify(repository, times(1)).save(any());
    }

    @Test
    void shouldSaveNewUserToDatabase() {
        //given
        String login = "anyLogin";
        User newUser = createUser(login);
        GithubUser githubUser =  createGithubUser(login);
        UsersTable usersTable = new UsersTable(login, 1);
        when(client.getDataFromGithub(login)).thenReturn(githubUser);
        when(repository.findUsersByLogin(login)).thenReturn(null);

        //when
        User user = service.updateCountCalculation(login);

        //then
        assertEquals(user, newUser);
        verify(repository, times(1)).save(usersTable);
    }

    @Test
    void shouldIncrementCountUserData() {
        //given
        String login = "anyLogin";
        Integer previewCount = 10;
        GithubUser githubUser =  createGithubUser(login);
        UsersTable usersTable = new UsersTable(login, previewCount);
        UsersTable incrementsUsersTable = new UsersTable(login, previewCount + 1);
        when(client.getDataFromGithub(login)).thenReturn(githubUser);
        when(repository.findUsersByLogin(login)).thenReturn(usersTable);

        //when
        service.updateCountCalculation(login);

        //then
        verify(repository, times(1)).save(incrementsUsersTable);
    }

    private User createUser(String login) {
        User user = new User();
        user.setId(1);
        user.setLogin(login);
        user.setName("anyName");
        user.setType("User");
        user.setAvatarUrl("anyUrl");
        user.setCreatedAt(now);
        user.setCalculations(44);
        return user;
    }

    private GithubUser createGithubUser(String login) {
        GithubUser user = new GithubUser();
        user.setId(1);
        user.setLogin(login);
        user.setName("anyName");
        user.setType("User");
        user.setAvatarUrl("anyUrl");
        user.setCreatedAt(now);
        user.setFollowers(3);
        user.setPublic_repos(20);
        return user;
    }
}