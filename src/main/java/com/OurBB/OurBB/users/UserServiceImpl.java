package com.OurBB.OurBB.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepo repo;

    @Override
    public Users getUserById(int userId) {
        return repo.findById(userId).get();
    }

    @Override
    public Users createUser(Users users) {
        Users user=repo.save(users);
        return user;
    }

    @Override
    public Users updateUser(Users users) {
        Users user=repo.save(users);
        return user;
    }

    @Override
    public String deleteUser(int userId) {
        repo.deleteById(userId);
        return "user details deleted successfully";
    }
}
