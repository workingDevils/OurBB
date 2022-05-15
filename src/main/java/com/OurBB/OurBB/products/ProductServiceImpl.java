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
        Products product=productRepo.getProductByName(productName).get(0);
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
    public Products updateProduct(int productId,double price,double quantity,Integer dealerId) {  //only dealer can update
        Optional<Dealers> dealer=dealerRepo.findById(dealerId);
        Products product=null;
        if(dealer.isPresent())
        {
            product=productRepo.findById(productId).get();
            if(price!=0 && quantity!=0 )
            {
                product.setPrice(price);
                product.setQuantity(quantity);
                product=productRepo.save(product);
            }
            else if(price!=0 )
            {
                product.setPrice(price);
                product=productRepo.save(product);
            }
            else if( quantity!=0 )
            {
                product.setQuantity(quantity);
                product=productRepo.save(product);
            }
        }
        return product;
    }

    @Override
    public String deleteProduct(int productId,Integer dealerId) {      //only dealer can update
        Optional<Dealers> dealer=dealerRepo.findById(dealerId);
        String response=null;
        if(dealer.isPresent())
        {
            productRepo.deleteById(productId);
            response="product deleted successfully by dealer- "+dealerId;
        }
        return response;
        }
}
