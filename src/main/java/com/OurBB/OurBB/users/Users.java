package com.OurBB.OurBB.users;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String userName;
    private String userAddress;
//    @Column(name = "Phone number")
    private String userPhoneNumber;
    private String cart;
    private String orders;    //in db structure is --> productId(timestamp)
    private String wishList;
}
