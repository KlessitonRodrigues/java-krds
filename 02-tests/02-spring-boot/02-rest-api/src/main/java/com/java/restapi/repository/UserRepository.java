package com.java.restapi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.java.restapi.models.UserModel;

@Repository
public class UserRepository {
    private final List<UserModel> users;

    UserRepository() {
        this.users = new ArrayList<UserModel>();

        users.add(new UserModel("kless", "94589553", "kless@email"));
        users.add(new UserModel("kless_2", "94523423", "kless_2@email"));
        users.add(new UserModel("kless_3", "94364635", "kless_3@email"));
    }

    public List<UserModel> findAll() {
        return users;
    }

    public void addUser(UserModel user) {
        users.add(user);
    }

    public boolean deleteUser(long id) {
        for (UserModel user : users) {
            if (user.getId() == id) {
                users.remove(user);
                return true;
            }
        }
        return false;
    }

    public boolean replaceUser(UserModel newUser) {
        for (UserModel user : users) {
            if (user.getId() == newUser.getId()) {
                int index = users.indexOf(user);
                users.set(index, newUser);
                return true;
            }
        }
        return false;
    }
}
