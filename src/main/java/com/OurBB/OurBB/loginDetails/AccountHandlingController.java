package com.OurBB.OurBB.loginDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.security.SecureRandom;

@RestController
public class AccountHandlingController {

    @Autowired
    AccountRepo accountRepo;

//    @GetMapping("/getAccount/{userName}")
    Account getAccountByUserName(@PathVariable String userName)
    {
        Account account=accountRepo.getAccount(userName);
        return account;
    }
    @PostMapping("/createAccount")
    Account createAccount(@RequestBody Account account)
    {
        PasswordEncoder passwordEncoder=new BCryptPasswordEncoder(10,new SecureRandom());
        account.setPassword(passwordEncoder.encode(account.getPassword()));
        account=accountRepo.save(account);
        return account;
    }
}
