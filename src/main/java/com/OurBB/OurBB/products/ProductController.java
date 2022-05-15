package com.OurBB.OurBB.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/allProducts")
    List<Products> allProducts(){
        return productService.allProducts();
    }
    @GetMapping("/getProductByName")
    Products getProductByName(@RequestParam String productName){
        return productService.getProductByName(productName);
    }
    @PostMapping("/createProduct")
    Products createProduct(Products products,Integer dealerId){
        return productService.createProduct(products,dealerId);
    }
    @PutMapping("/updateProduct")
    Products updateProduct(@RequestParam int productId,@RequestParam double price,
                           @RequestParam double quantity,@RequestParam Integer dealerId)
    {
        return productService.updateProduct(productId,price,quantity,dealerId);
    }
    @DeleteMapping("/deleteProduct")
    String deleteProduct(@RequestParam int productId,@RequestParam Integer dealerId){
        return productService.deleteProduct(productId,dealerId);
    }

//    @GetMapping("/exploit")
//    List<Products> exploit(){
//        List<Products> exploitList=new ArrayList<>();
//        for(int i=0;i<100000;i++)
//        {
//            exploitList.addAll(allProducts());
//        }
//        return exploitList;
//    }
}
