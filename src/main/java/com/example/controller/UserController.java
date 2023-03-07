package com.example.controller;

import com.example.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Api(tags = "用户登录注册模块")
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @ApiOperation("用户登录")
    @PostMapping("/login")
    public Object userLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
        Object loginInfo = userService.login(username, password);
        return loginInfo;
    }

    @ApiOperation("商家注册")
    @GetMapping("/merchantRegister")
    public Boolean merchantRegister(@RequestParam("username") String username, @RequestParam("password") String password) {
        Boolean message = userService.MerchantRegister(username, password);
        return message;
    }

    @ApiOperation("消费者注册")
    @GetMapping("/consumerRegister")
    public Boolean consumerRegister(@RequestParam("username") String username, @RequestParam("password") String password) {
        Boolean message = userService.ConsumerRegister(username, password);
        return message;
    }

}
