package com.example.empik.config;

import com.example.empik.database.UsersRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class MariaConfig {

    //@Bean(name="mariaDb")
    CommandLineRunner initDatabase( UsersRepository repository) {

        return args -> {
            long count = repository.count();
            System.out.println(count);
            System.out.println("create new account");
        };
    }
}
