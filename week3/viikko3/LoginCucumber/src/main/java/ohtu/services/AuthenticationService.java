package ohtu.services;

import ohtu.domain.User;
import java.util.ArrayList;
import java.util.List;
import ohtu.data_access.UserDao;

public class AuthenticationService {

    private UserDao userDao;

    public AuthenticationService(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean logIn(String username, String password) {
        for (User user : userDao.listAll()) {
            if (user.getUsername().equals(username)
                    && user.getPassword().equals(password)) {
                return true;
            }
        }

        return false;
    }

    public boolean createUser(String username, String password) {
        if (userDao.findByName(username) != null) {
            return false;
        }

        if (invalid(username, password)) {
            return false;
        }

        userDao.add(new User(username, password));

        return true;
    }

    // Username has to be a minimum of 3 characters and only contain a-z
    // Password has to be atleast 8 characters and contains atleast 1 number or special character
    private boolean invalid(String username, String password) {
        if (username.length() >= 3 && username.matches("[a-zA-Z]+") && password.length() >= 8 && !password.matches("[a-zA-Z]+")) {
            return false;
        }
        return true;
    }
}
