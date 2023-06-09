package service;

import model.User;

import java.util.List;

public interface UserService {
    void createUsersTable();

    void dropUsersTable();

    void saveUser(String name, String lastName, byte age);

    void removeUserById(long id);

    List<User> getAllUsers();

    List<User> getUsersWhoseAgeBetween(int startAge, int finishAge);

    void cleanUsersTable();
}
