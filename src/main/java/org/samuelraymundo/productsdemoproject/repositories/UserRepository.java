package org.samuelraymundo.productsdemoproject.repositories;

import org.samuelraymundo.productsdemoproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
