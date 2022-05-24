package com.OurBB.OurBB.loginDetails;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@Entity
@Table(name = "account_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account{
    @Id
    @NotNull
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    @NotNull
    private String password;
    @Column(name = "roles")
    private String roles;
    @Column(name="is_enabled")
    private Boolean isEnabled;

}
