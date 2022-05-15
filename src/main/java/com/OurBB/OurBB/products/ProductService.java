package com.OurBB.OurBB.products;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Products> allProducts();
    Products getProductByName(String ProductName);
    Products createProduct(Products products,Integer dealerId);
    Products updateProduct(int productId,double price,double quantity,Integer dealerId);
    String deleteProduct(int productId,Integer dealerId);

}
