package com.example.empik.database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<UsersTable, Long> {
    UsersTable findUsersByLogin(String login);
}
