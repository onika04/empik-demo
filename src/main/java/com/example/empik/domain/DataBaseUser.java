package com.example.empik.domain;

import java.util.Objects;

public class DataBaseUser {
    private String login;
    private long request_count;

    public DataBaseUser(String login, long request_count) {
        this.login = login;
        this.request_count = request_count;
    }

    public long getRequest_count() {
        return request_count;
    }

    public void setRequest_count(long request_count) {
        this.request_count = request_count;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataBaseUser that = (DataBaseUser) o;
        return request_count == that.request_count && Objects.equals(login, that.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, request_count);
    }

    @Override
    public String toString() {
        return "DataBaseUser{" +
                "login='" + login + '\'' +
                ", request_count=" + request_count +
                '}';
    }
}
