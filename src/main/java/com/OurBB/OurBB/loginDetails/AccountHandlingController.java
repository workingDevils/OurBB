package com.OurBB.OurBB.loginDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountHandlingController {

    @Autowired
    AccountRepo accountRepo;

//    @GetMapping("/getAccount/{userName}")
    Account getAccountByUserName(@PathVariable String userName)
    {
        Account account=accountRepo.getAccount(userName);
        System.out.println(account);
        return account;
    }
}
