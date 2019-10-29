package com.bjsxt.order.service.impl;

import com.bjsxt.order.pojo.Order;
import com.bjsxt.order.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public Order loadOrder(Integer id) {
        Order order = new Order();
        order.setId(id);
        order.setRemark("美女配送====8080");
        order.setTotal(110);
        return order;
    }

    @Override
    public List<Order> loadOrderList() {
        List<Order> list = new ArrayList<>();
        Order order1 = new Order();
        order1.setId(111);
        order1.setRemark("美女配送");
        order1.setTotal(234);
        Order order2 = new Order();
        order2.setId(111);
        order2.setRemark("shuagepeisong");
        order2.setTotal(567);
        list.add(order1);
        list.add(order2);
        return list;
    }
}
