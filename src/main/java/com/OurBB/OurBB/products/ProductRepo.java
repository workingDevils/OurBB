package com.OurBB.OurBB.products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ProductRepo extends JpaRepository<Products,Integer> {
    @Query(
            value = "SELECT * FROM products WHERE productName=?",
            nativeQuery = true)
    Products getProductByName();
}
