package com.OurBB.OurBB.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepo repo;

    @Override
    public Users getUserById(int userId) {
        Users user=repo.findById(userId).get();
        return user;
    }

    @Override
    public Users createUser(Users users) {
        return null;
    }

    @Override
    public Users updateUser(Users users) {
        return null;
    }

    @Override
    public Users deleteUser(int userId) {
        return null;
    }
}
