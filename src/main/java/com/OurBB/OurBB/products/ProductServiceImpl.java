package com.OurBB.OurBB.products;

import com.OurBB.OurBB.dealer.DealerRepo;
import com.OurBB.OurBB.dealer.Dealers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductRepo productRepo;
    @Autowired
    DealerRepo dealerRepo;

    @Override
    public List<Products> allProducts() {
        List<Products> allProducts=productRepo.findAll();
        return allProducts;
    }

    @Override
    public Products getProductByName(String productName) {
        Products product=productRepo.getProductByName();
        return product;
    }

    @Override
    public Products createProduct(Products products,Integer dealerId) {      //only dealer can update
        Optional<Dealers> dealer=dealerRepo.findById(dealerId);
        Products product=null;
        if(dealer.isPresent())
        {
            product=productRepo.save(products);
        }
        return product;
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
