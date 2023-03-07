package com.example.controller;

import com.example.model.Orders;
import com.example.service.OrderService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "订单信息接口")
@RequestMapping("/orders")
public class OrdersController {

    @Resource
    private OrderService orderService;

    @ApiOperation("查看所有订单")
    @GetMapping("/findAll")
    public PageInfo<Orders> findAll(@RequestParam(defaultValue = "1") Integer pageNum,
                                    @RequestParam(defaultValue = "5") Integer pageSize) {
        PageInfo<Orders> allOrder = orderService.findAllOrder(pageNum, pageSize);
        return allOrder;
    }

    @ApiOperation("根据商家id查询")
    @GetMapping("/findBySid")
    public List<Orders> findBySid(@RequestParam("sid") Integer sid) {
        List<Orders> allBySid = orderService.findAllBySid(sid);
        return allBySid;
    }

    @ApiOperation("根据id删除")
    @GetMapping("/deleteById")
    public Boolean deleteById(@RequestParam("id") Integer id) {
        Boolean aBoolean = orderService.deleteById(id);
        return aBoolean;
    }

    @ApiOperation("根据消费者id查询")
    @GetMapping("/findByUid")
    public List<Orders> findByUid(@RequestParam("uid") Integer uid) {
        List<Orders> byUid = orderService.findByUid(uid);
        return byUid;
    }

    @ApiOperation("更改订单状态")
    @PostMapping("/updateStatus")
    public boolean updateStatus(@RequestBody Orders orders) {
        Boolean aBoolean = orderService.updateStatus(orders.getDid(), orders.getStatus());
        return aBoolean;
    }

    @ApiOperation("根据订单状态查询")
    @GetMapping("/findAllByStatus")
    public PageInfo<Orders> findAllByStatus(@RequestParam(defaultValue = "1") Integer pageNum,
                                            @RequestParam(defaultValue = "5") Integer pageSize,
                                            Integer status,
                                            Integer sid) {
        PageInfo<Orders> pageInfo = orderService.findAllByStatus(pageNum, pageSize, status, sid);
        return pageInfo;
    }

    @ApiOperation("生成订单")
    @PostMapping("/createOrders")
    public Boolean createOrders(@RequestBody Orders orders) {
        System.out.println(orders);
        Boolean orders1 = orderService.createOrders(orders);
        return null;
    }

    @ApiOperation("查询销售情况")
    @RequestMapping("/findSell")
    public  List<Orders> selectAllSum(@RequestParam("sid") Integer sid){
        List<Orders> orders =  orderService.selectAllSum(sid);
        return orders;
    }

}
