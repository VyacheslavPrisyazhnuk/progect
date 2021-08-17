package my.service;

import my.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Loader {
    @Autowired
    UserService userServices;


    @PostConstruct
    public void initApiUserData() {
        User user1 = new User("user", "user", 33, "user");
        userServices.createUser(user1);
        userServices.createUser(new User("Andrew", "Agalakov", 20, "admin"));
        userServices.createUser(new User("admin", "admin", 13, "admin"));
        userServices.createUser(new User("Vyacheslav", "Prisyazhnuk", 2, "admin"));
        userServices.createUser(new User("Olga", "Zhenova", 5, "admin"));
        userServices.createUser(new User("Mazik", "Aple", 67, "admin"));
    }

}
