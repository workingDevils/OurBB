package com.OurBB.OurBB.users;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    Users getUserById(int userId);
//    Users getUserWishListById(int userId);
//    Users getUserOrdersById(int userId);
    Users createUser(Users users);
    Users updateUser(Users users);
    String deleteUser(int userId);
}
