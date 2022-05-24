package com.OurBB.OurBB.loginDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AccountDetailsService implements UserDetailsService {
    @Autowired
    AccountHandlingController accountHandlingController;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AccountDetails accountDetails=new AccountDetails(accountHandlingController.getAccountByUserName(username));
        return accountDetails;
    }
}
