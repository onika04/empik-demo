package com.example.empik.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class MariaConnectionTest {
        public static void main(String[] args) {
            System.out.println("init");
            try {
                try (Connection testConnections = DriverManager.getConnection("jdbc:mariadb://localhost:3306/empik?user=root&password=admin")){
                    System.out.println("connected");
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
}
