package com.descomplica.frameblog.repositories;

import com.descomplica.frameblog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepositoy extends JpaRepository<User, Long>{

    User findByUserName(String login);
    
}
