package com.company.manager.Service;

import java.util.List;

import com.company.manager.Entity.Orders;

public interface OrderService {
    public List<Orders> getAllOrders();

    public Orders getAllOrders(Long id);

    public boolean addOrders(Orders orders);

    public boolean deleteOrder(Long id);
}