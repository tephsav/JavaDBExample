package service;

import dao.UserDao;
import dao.UserDaoJDBCImpl;
import model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl() {
        this.userDao = new UserDaoJDBCImpl();
        //this.userDao = new UserDaoHibernateImpl();
    }

    public void createUsersTable() {
        userDao.createUsersTable();
    }

    public void dropUsersTable() {
        userDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public List<User> getUsersWhoseAgeBetween(int startAge, int finishAge) {
        return userDao.getUsersWhoseAgeBetween(startAge, finishAge);
    }

    public void cleanUsersTable() {
        userDao.cleanUsersTable();
    }
}
