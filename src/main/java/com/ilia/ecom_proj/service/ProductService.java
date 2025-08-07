package com.ilia.ecom_proj.service;

import com.ilia.ecom_proj.model.Product;
import com.ilia.ecom_proj.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    ProductRepo repo;

    @Autowired
    ProductService(ProductRepo repo){
        this.repo = repo;
    }

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int id){
        return repo.findById(id).orElse(null);
    }
}
