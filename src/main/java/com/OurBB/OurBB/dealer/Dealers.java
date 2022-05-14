package com.OurBB.OurBB.dealer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Dealers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int dealerId;
    private String dealerName;
    private String shopName;
    private  String shopAddress;
    private String dealerPhoneNumber;
}
