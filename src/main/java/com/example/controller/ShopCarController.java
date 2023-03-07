package com.example.controller;

import com.example.model.Shopcar;
import com.example.service.ShopCarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "购物车接口")
@RequestMapping("/shopCar")
public class ShopCarController {
    @Resource
    private ShopCarService shopCarService;

    @ApiOperation("添加商品到购物车")
    @PostMapping("/addGoodForCar")
    public Boolean addGoodForCar(@RequestBody Shopcar shopcar) {
        Boolean aBoolean = shopCarService.addGoodForCar(shopcar);
        return aBoolean;
    }

    @ApiOperation("根据用户id查询该用户购物车信息")
    @GetMapping("/findAllByUid")
    public List<Shopcar> findAllByUid(@RequestParam("uid") Integer uid) {
        List<Shopcar> allByUid = shopCarService.findAllByUid(uid);
        return allByUid;
    }

    @ApiOperation("从购物车里删除商品")
    @GetMapping("/delete")
    public Boolean deleteById(@RequestParam("id") Integer id) {
        Boolean aBoolean = shopCarService.deleteOneById(id);
        return aBoolean;
    }

    @ApiOperation("购物车商品数量+1")
    @GetMapping("/increase")
    public Boolean increase(@RequestParam("id") Integer id) {
        Boolean increase = shopCarService.increase(id);
        return increase;
    }

    @ApiOperation("购物车商品数量-1")
    @GetMapping("/decrease")
    public Boolean decrease(@RequestParam("id") Integer id) {
        Boolean decrease = shopCarService.decrease(id);
        return decrease;
    }
}
