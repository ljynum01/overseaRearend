package com.example.controller;

import com.example.model.Area;
import com.example.service.AreaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "地区接口")
@RequestMapping("/area")
public class AreaController {
    @Resource
    private AreaService areaService;

    @ApiOperation("查看所有地区")
    @GetMapping("/findAll")
    public List<Area> findAll(){
        return areaService.selectAllArea();
    }

}
