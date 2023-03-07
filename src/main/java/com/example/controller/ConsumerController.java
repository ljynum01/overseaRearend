package com.example.controller;

import com.example.model.Consumer;
import com.example.service.ConsumerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "消费者接口")
@RequestMapping("/consumer")
public class ConsumerController {
    @Resource
    private ConsumerService consumerService;

    @ApiOperation("根据用户id查询")
    @GetMapping("/findById")
    public Consumer findById(@RequestParam("id") Integer id) {
        Consumer consumer = consumerService.findByid(id);
        return consumer;
    }

    @ApiOperation("查询所有消费者")
    @GetMapping("/findAll")
    public List<Consumer> findAll() {
        List<Consumer> all = consumerService.findAll();
        return all;
    }


    @ApiOperation("修改信息")
    @PostMapping("/update")
    public Boolean update(@RequestBody Consumer consumer) {
        Boolean aBoolean = consumerService.updateById(consumer);
        return aBoolean;
    }

    @ApiOperation("删除")
    @PostMapping("/delete")
    public Boolean delete(@RequestBody Consumer consumer) {
        Boolean delete = consumerService.delete(consumer);
        return delete;
    }


}
