package com.company.manager.Service;

import java.util.List;

import com.company.manager.Entity.Products;

public interface ProductService {
    public List<Products> getProducts();

    public Products getProduct(Long id);

    public boolean addProduct(Products products);

    public boolean deleteProduct(Long id);
}
