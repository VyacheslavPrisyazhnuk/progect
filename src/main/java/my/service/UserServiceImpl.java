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
  // private boolean isInitDB;
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }



    @Override
    public void createUser(User user) {
        userDao.createUser(user);
    }

    @Override
    public List<User> readUsers() {
//        if (!isInitDB) {
//         initDB();
//         isInitDB = true;
//        }
        return userDao.readUsers();
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
//    private void initDB () {
//        userDao.createUser(new User("user", "user", 33, "user"));
//        userDao.createUser(new User("Andrew", "Agalakov", 20, "admin"));
//        userDao.createUser(new User("admin", "admin", 13, "admin"));
//        userDao.createUser(new User("Vyacheslav", "Prisyazhnuk", 2, "admin"));
//        userDao.createUser(new User("Olga", "Zhenova", 5, "admin"));
//        userDao.createUser(new User("Mazik", "Aple", 67, "admin"));
//    }
}
