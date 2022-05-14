package com.OurBB.OurBB.products;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Products> allProducts();
    Products getProductByName(String ProductName);
    Products createProduct(Products products);
    Products updateProduct(Products products);
    Products deleteProduct(int productId);

}
