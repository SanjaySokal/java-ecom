package com.company.manager.ServiceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.manager.Entity.Products;
import com.company.manager.Repo.ProductRepo;
import com.company.manager.Service.ProductService;

@Service
public class ProductImpl implements ProductService {
    @Autowired
    private ProductRepo repo;

    @Override
    public List<Products> getProducts() {
        return repo.findAll();
    }

    @Override
    public Products getProduct(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public boolean addProduct(Products products) {
        repo.save(products);
        return true;
    }

    @Override
    public boolean deleteProduct(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }
}
