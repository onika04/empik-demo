package com.example.empik.database;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users_dev")
public class UsersTable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String login;
    @Column(nullable = false)
    private long request_count;

    public UsersTable() {

    }

    public UsersTable(Long id, String login, long request_count) {
        this.id = id;
        this.login = login;
        this.request_count = request_count;
    }

    @Override
    public String toString() {
        return "UsersTable{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", request_count=" + request_count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersTable that = (UsersTable) o;
        return request_count == that.request_count && Objects.equals(id, that.id) && Objects.equals(login, that.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, request_count);
    }
}
