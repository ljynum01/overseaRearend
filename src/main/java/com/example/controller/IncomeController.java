package com.example.controller;

import com.example.service.IncomeService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "收入接口")
@RequestMapping("/income")
public class IncomeController {

//    @Resource
//    private IncomeService incomeService;
}
