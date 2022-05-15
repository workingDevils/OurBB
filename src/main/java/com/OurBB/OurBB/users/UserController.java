package com.OurBB.OurBB.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUserById/{userId}")
    public Users getUserById(@PathVariable int userId)
    {
        Users user=userService.getUserById(userId);
        return user;
    }
    @PostMapping("/createUser")
    Users createUser(Users users){
        return userService.createUser(users);
    }
    @PutMapping("/updateUser")
    Users updateUser(Users users){
        return userService.updateUser(users);
    }
    @DeleteMapping("/deleteUser")
    String deleteUser(int userId){
        return userService.deleteUser(userId);
    }

}
