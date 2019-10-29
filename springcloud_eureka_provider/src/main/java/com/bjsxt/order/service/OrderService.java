package com.bjsxt.order.service;

import com.bjsxt.order.pojo.Order;

import java.util.List;

public interface OrderService {
    /**
     * 查询单个订单
     * @return
     */
    Order loadOrder(Integer id);

    /**
     * 查询订单列表
     * @return
     */
    List<Order>loadOrderList();
}
