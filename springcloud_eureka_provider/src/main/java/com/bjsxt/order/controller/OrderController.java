package com.bjsxt.order.controller;


import com.bjsxt.order.pojo.Order;
import com.bjsxt.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/order/{id}")
    public Order loadOrder(@PathVariable("id") Integer id){
        return orderService.loadOrder(id);
    }
    @GetMapping("/order")
    public List<Order> loadOrderList(){
        return orderService.loadOrderList();
    }
}
