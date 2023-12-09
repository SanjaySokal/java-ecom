package com.company.manager.Service;

import java.util.List;

import com.company.manager.Entity.Catagories;

public interface CategoryService {
    public List<Catagories> getAllCatagories();

    public Catagories getCatagoryById(Long id);

    public boolean editCatagory(Catagories category);

    public boolean deleteCatagory(Long id);
}
