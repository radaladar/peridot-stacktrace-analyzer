package com.example;/// Created by BB on 2017-01-16.

import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.packages.UserRepo;

@SpringBootApplication
public class App implements CommandLineRunner{

    @Autowired
    private UserRepo repo;


    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        repo.deleteAll();
        repo.save(new User("Lacika", "Kovács"));
        repo.save(new User("Béci", "Lakatos"));
        repo.save(new User("Gézuka", "Oláh"));
    }
}
