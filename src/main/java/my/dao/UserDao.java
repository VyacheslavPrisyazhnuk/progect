package my.dao;


import my.models.User;

import java.util.List;

public interface UserDao {
    void createUser(User user);

    List<User> readUsers();

    void updateUser(User user);

    void deleteUser(User user);

    User getUserById(int id);
}
