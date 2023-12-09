package com.company.manager.ServiceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.manager.Entity.Catagories;
import com.company.manager.Repo.CategoryRepo;
import com.company.manager.Service.CategoryService;

@Service
public class CategoryImpl implements CategoryService {
    @Autowired
    private CategoryRepo repo;

    @Override
    public List<Catagories> getAllCatagories() {
        return repo.findAll();
    }

    @Override
    public Catagories getCatagoryById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public boolean editCatagory(Catagories category) {
        repo.save(category);
        return true;
    }

    @Override
    public boolean deleteCatagory(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }
}
