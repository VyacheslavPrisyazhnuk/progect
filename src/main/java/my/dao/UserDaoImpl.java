package my.dao;


import my.models.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {


    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void createUser(User user) {
        entityManager.persist(user);

    }

    @Override
    public List<User> readUsers() {
        Query query = entityManager.createQuery("SELECT u FROM User u");
        return query.getResultList();
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

    @Override
    public void deleteUser(User user) {
        Object managed = entityManager.merge(user);
        entityManager.remove(managed);
    }

    @Override
    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }

}
