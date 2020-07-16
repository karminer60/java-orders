package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Order;
import com.lambdaschool.orders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;


@Service(value = "orderService")
public class OrderServicesImpl implements OrderServices
{
    @Autowired
    private OrderRepository orderrepos;


    @Override
    public List<Order> findAllOrders()
    {
        List<Order> list = new ArrayList<>();

        orderrepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
}
