package com.example.empik.database;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users_dev")
public class UsersTable {
    @Column(nullable = false)
    private String login;
    @Column(nullable = false)
    private long request_count;

    public UsersTable() {

    }

    public UsersTable(String login, long request_count) {
        this.login = login;
        this.request_count = request_count;
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

    public void setRequest_count(long request_count) {
        this.request_count = request_count;
    }


    @Override
    public String toString() {
        return "UsersTable{" +
                ", login='" + login + '\'' +
                ", request_count=" + request_count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersTable that = (UsersTable) o;
        return request_count == that.request_count && Objects.equals(login, that.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, request_count);
    }
}
