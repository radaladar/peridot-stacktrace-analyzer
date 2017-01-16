/// Created by BB on 2017-01-16.
package com.example.packages;

import com.example.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
public interface UserRepo extends CrudRepository<User, Long> {

    List<User> findAll();
}
