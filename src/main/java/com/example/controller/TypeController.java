package com.example.controller;

import com.example.model.Type;
import com.example.service.TypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "商品类别接口")
@RequestMapping("/types")
public class TypeController {
    @Resource
    private TypeService typeService;

    @ApiOperation("查看所有商品类别")
    @GetMapping("/findAll")
    public List<Type> findAll() {
        return typeService.selectAllType();
    }

    @ApiOperation("删除商品类别")
    @GetMapping("/delete")
    public Boolean delete(@RequestParam("id") Integer id) {
        return typeService.delete(id);
    }

    @ApiOperation("新增商品类别")
    @GetMapping("/add")
    public Boolean delete(@RequestBody Type type) {
        return typeService.addType(type);
    }

    @ApiOperation("修改商品类别")
    @GetMapping("/update")
    public Boolean update(@RequestBody Type type) {
        return typeService.update(type);
    }
}
