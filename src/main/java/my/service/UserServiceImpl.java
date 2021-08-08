package my.service;


import my.dao.UserDao;
import my.models.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    @Override
    public void createUser(User user) {
        userDao.createUser(user);
    }

    @Override
    public List<User> readUsers() {
        return getUserDao().readUsers();
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}
