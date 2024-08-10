package org.samuelraymundo.productsdemoproject.resources;

import org.samuelraymundo.productsdemoproject.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    public ResponseEntity<User> findAll() {
        return ResponseEntity.ok().body(new User(1L,"Maria","Maria@gmail.com","99999","1234"));
    }
}
