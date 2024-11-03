package com.descomplica.frameblog.services.impl;

import com.descomplica.frameblog.models.User;
import com.descomplica.frameblog.repositories.UserRepositoy;
import com.descomplica.frameblog.services.UserService;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepositoy userRepository;

    @Override
    public User save(final User user) {
        User existingUser = userRepository.findByUserName(user.getName());
        if (Objects.nonNull(existingUser)) {
            throw new RuntimeException("Existing User");
        }

        User entity = new User(user.getUserId(), user.getName(), user.getEmail(), user.getUsername(), user.getPassword(), user.getRole());

        User newUser = userRepository.save(entity);

        return new User(newUser.getUserId(), newUser.getName(), newUser.getEmail(), newUser.getUsername(), newUser.getPassword(), newUser.getRole());
    }

    @Override
    public List<User> getAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public User get(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public User update(Long id, User user) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
