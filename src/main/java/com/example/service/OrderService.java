package com.example.service;

import com.example.model.Orders;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface OrderService {
    public PageInfo<Orders> findAllOrder(Integer pageNum, Integer pageSize);

    public List<Orders> findAllBySid(Integer sid);

    public Boolean deleteById(Integer id);

    public List<Orders> findByUid(Integer uid);

    public Boolean updateStatus(Integer id, Integer status);

    public Boolean createOrder(Orders orders);

    public PageInfo<Orders> findAllByStatus(Integer pageNum, Integer pageSize, Integer status, Integer sid);

    public Boolean createOrders (Orders orders);

    public List<Orders> selectAllSum(Integer sid);

}
