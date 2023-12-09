package com.company.manager.ServiceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.manager.Entity.Cart;
import com.company.manager.Repo.CartRepo;
import com.company.manager.Service.CartService;

@Service
public class CartImpl implements CartService {
    @Autowired
    private CartRepo repo;

    @Override
    public List<Cart> getAllCart() {
        return repo.findAll();
    }

    @Override
    public Cart getCartById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public boolean editCart(Cart cart) {
        repo.save(cart);
        return false;
    }

    @Override
    public boolean deleteCart(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }
}
