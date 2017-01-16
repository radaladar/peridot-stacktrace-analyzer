/// Created by BB on 2017-01-16.
package model;

import javax.persistence.Entity;

@Entity
public class User {
    String firstName;
    String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
