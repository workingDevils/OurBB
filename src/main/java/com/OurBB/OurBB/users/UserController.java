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
        return user;
    }

    @GetMapping("/")
    public String home()
    {
        return "home";
    }

}
