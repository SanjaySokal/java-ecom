package com.company.manager.Service;

import java.util.List;

import com.company.manager.Entity.Cart;

public interface CartService {
    public List<Cart> getAllCart();

    public Cart getCartById(Long id);

    public boolean editCart(Cart cart);

    public boolean deleteCart(Long id);
}
