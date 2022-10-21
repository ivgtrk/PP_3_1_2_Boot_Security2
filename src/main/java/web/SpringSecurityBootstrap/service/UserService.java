package web.SpringSecurityBootstrap.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import web.SpringSecurityBootstrap.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<User> getAllUsers();

    User getUserById(Long id);

    void saveUser(User user);

    void deleteUser(Long id);

    void createNewUser(User user);
}
