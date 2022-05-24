package com.OurBB.OurBB.loginDetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<Account, String> {
    @Query(value = "select * from account_details where user_name=?1", nativeQuery = true)
    Account getAccount(String userName);

}
