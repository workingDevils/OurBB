package com.OurBB.OurBB.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;
    @GetMapping("/getUserById/{userId}")
    public Users getUserById(@PathVariable int userId)
    {
        Users user=userService.getUserById(userId);
        System.out.println(user);
        return user;
    }

    @GetMapping("/")
    public String home()
    {
        return "home";
    }

}
