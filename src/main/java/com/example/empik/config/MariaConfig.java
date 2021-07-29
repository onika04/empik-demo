package com.example.empik.config;

import com.example.empik.database.UsersRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

@Configuration
public class MariaConfig {

    @Bean(name = "mariaDb")
    CommandLineRunner initDatabase(UsersRepository repository) {
        try {
            try (Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/empik?user=root&password=admin")) {
                System.out.println("connected");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return args -> repository.count();
    }
}
