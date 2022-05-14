package com.OurBB.OurBB.products;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    @Override
    public List<Products> allProducts() {
        return null;
    }

    @Override
    public Products getProductByName(String ProductName) {
        return null;
    }

    @Override
    public Products createProduct(Products products) {      //only dealer can update
        return null;
    }

    @Override
    public Products updateProduct(Products products) {  //only dealer can update
        return null;
    }

    @Override
    public Products deleteProduct(int productId) {      //only dealer can update
        return null;
    }
}
