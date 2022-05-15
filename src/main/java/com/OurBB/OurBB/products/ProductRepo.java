package com.OurBB.OurBB.products;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Products,Integer> {
    @Query(
            value = "SELECT * FROM PRODUCTS p WHERE p.PRODUCT_NAME=?1",
            nativeQuery = true)
    List<Products> getProductByName(String productName);
}
