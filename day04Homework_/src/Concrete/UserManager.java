package Concrete;

import Abstract.UserService;
import Entity.User;

public class UserManager implements UserService {
    @Override
    public void add(User user) {
        System.out.println(user.getEmail() + " : added.");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getEmail() + " : deleted.");
    }

    @Override
    public void update(User user) {
        System.out.println(user.getEmail() + " : updated.");
    }
}
