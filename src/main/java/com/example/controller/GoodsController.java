package com.example.controller;

import com.example.model.Goods;
import com.example.service.GoodsService;
import com.example.service.ImageService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Api(tags = "商品信息接口")
@RequestMapping("/goods")
public class GoodsController {
    @Resource
    private GoodsService goodsService;

    @Resource
    private ImageService imageService;


    @ApiOperation("查询所有商品信息")
    @GetMapping("/findAll")
    public PageInfo<Goods> findAll(@RequestParam(defaultValue = "1") Integer pageNum,
                                   @RequestParam(defaultValue = "5") Integer pageSize) {
        PageInfo<Goods> allGoods = goodsService.findAllGood(pageNum, pageSize);
        return allGoods;
    }

    @ApiOperation("根据商家id查询发布的商品")
    @GetMapping("/findGoodsBySid")
    public PageInfo<Goods> findGoodsBySid(@RequestParam(defaultValue = "1") Integer pageNum,
                                          @RequestParam(defaultValue = "6") Integer pageSize,
                                          Integer sid) {
        PageInfo<Goods> goodsBySid = goodsService.findGoodsBySid(pageNum, pageSize, sid);
        return goodsBySid;
    }

    @ApiOperation("根据商品类别查询")
    @GetMapping("/findGoodsByLid")
    public PageInfo<Goods> findGoodsByLid(@RequestParam(defaultValue = "1") Integer pageNum,
                                          @RequestParam(defaultValue = "10") Integer pageSize,
                                          @RequestParam("lid") Integer lid) {
        PageInfo<Goods> goodsByLid = goodsService.findGoodsByLid(pageNum, pageSize, lid);
        return goodsByLid;
    }

    @ApiOperation("根据商品id查询")
    @GetMapping("/findGoodsById")
    public Goods findGoodsById(@RequestParam("id") Integer id) {
        Goods goods = goodsService.findGoodsById(id);
        return goods;
    }

    @ApiOperation("根据商品id进行删除")
    @GetMapping("/deleteById")
    public Boolean deleteById(@RequestParam("id") Integer id) {
        Boolean aBoolean = goodsService.deleteGoodsById(id);
        return aBoolean;
    }

    @ApiOperation("新增商品")
    @PostMapping("/addGoods")
    public Boolean addGoods(@RequestBody Goods goods) {
        System.out.println(goods);
        goods.setCid((int)System.currentTimeMillis());
        Boolean aBoolean = goodsService.addGoods(goods);
        Boolean aBoolean1 = imageService.saveImage(goods.getImgUrl(), goods.getCid());
        return aBoolean;
    }

    @ApiOperation("修改商品")
    @PostMapping("/updateGoods")
    public Boolean updateGoods(@RequestBody Goods goods) {
        System.out.println(goods);
        Boolean aBoolean = goodsService.updateGoods(goods);
        if (goods.getImgUrl()!=null) {
            imageService.updateImage(goods.getImgUrl(), goods.getCid());
        }
        return aBoolean;
    }
}
