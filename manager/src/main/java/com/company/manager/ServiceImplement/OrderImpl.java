package com.company.manager.ServiceImplement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.company.manager.Entity.Orders;
import com.company.manager.Repo.OrderRepo;
import com.company.manager.Service.OrderService;

@Service
public class OrderImpl implements OrderService {
    private OrderRepo repo;

    @Override
    public List<Orders> getAllOrders() {
        return repo.findAll();
    }

    @Override
    public Orders getAllOrders(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public boolean addOrders(Orders orders) {
        repo.save(orders);
        return true;
    }

    @Override
    public boolean deleteOrder(Long id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }
}
