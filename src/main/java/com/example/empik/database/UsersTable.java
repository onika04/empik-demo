package com.example.empik.database;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users_test")
public class UsersTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private String login;
    @Column(nullable = true)
    private long request_count;

    public UsersTable() {

    }

    public UsersTable(Long id, String login, long request_count) {
        this.id = id;
        this.login = login;
        this.request_count = request_count;
    }

    public UsersTable(String login, long request_count) {
        this.login = login;
        this.request_count = request_count;
    }


    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getRequest_count() {
        return request_count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersTable that = (UsersTable) o;
        return id == that.id && request_count == that.request_count && Objects.equals(login, that.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, request_count);
    }

    @Override
    public String toString() {
        return "UsersTable{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", request_count=" + request_count +
                '}';
    }
}
