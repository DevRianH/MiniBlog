package com.descomplica.frameblog.services;

import com.descomplica.frameblog.models.User;
import java.util.List;

public interface UserService {

    public User save(User user);

    public List<User> getAll();

    public User get(Long id);

    public User update(Long id, User user);

    public void delete(Long id);

}
