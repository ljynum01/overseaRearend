package com.example.controller;

import com.example.model.Merchant;
import com.example.service.MerchantService;
import com.example.service.UserService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "商家信息接口")
@RequestMapping("/merchant")
public class MerchantController {
    @Resource
    private MerchantService merchantService;

    @Resource
    private UserService userService;

    @ApiOperation("查看所有商家信息")
    @GetMapping("findMerchant")
    public List<Merchant> findMerchant(@RequestParam(defaultValue = "1") Integer pageNum,
                                           @RequestParam(defaultValue = "10") Integer pageSize) {
        List<Merchant> merchants = merchantService.selectAllMerchant(pageNum, pageSize);
        return merchants;
    }

    @ApiOperation("新增一名商家信息")
    @PostMapping("/insert")
    public Boolean insertMerchant(@RequestParam("username") String username,
                                  @RequestParam("password") String password,
                                  @RequestParam("phone") String phone,
                                  @RequestParam("addressid") Integer addressid) {
        Boolean aBoolean = userService.userInexistence(username);
        if (aBoolean) {
            Merchant merchant = new Merchant();
            merchant.setSname(username);
            merchant.setSpasswd(password);
            merchant.setSphone(phone);
            merchant.setSaddressid(addressid);
            Boolean aBoolean1 = merchantService.insertOne(merchant);
            return aBoolean1;
        }else {
            return false;
        }
    }

    @ApiOperation("根据id查询")
    @GetMapping("/findById")
    public Merchant findById(@RequestParam("id") Integer id) {
        Merchant merchant = merchantService.findById(id);
        return merchant;
    }

    @ApiOperation("根据用户名查询")
    @GetMapping("/findByName")
    public Merchant findByName(@RequestParam("username") String username) {
        Merchant merchant = merchantService.findByName(username);
        return merchant;
    }

    @ApiOperation("删除一条商家记录")
    @GetMapping("/deleteById")
    public Boolean deleteById(@RequestParam("id") Integer id) {
        Boolean aBoolean = merchantService.deleteById(id);
        return aBoolean;
    }

    @ApiOperation("修改一条商家信息")
    @PostMapping("/update")
    public Boolean update(@RequestParam("id") Integer id,
                          @RequestParam("username") String username,
                          @RequestParam("password") String password,
                          @RequestParam("phone") String phone,
                          @RequestParam("address") Integer addressid) {
        Merchant merchant = new Merchant();
        merchant.setSid(id);
        merchant.setSname(username);
        merchant.setSpasswd(password);
        merchant.setSphone(phone);
        merchant.setSaddressid(addressid);
        Boolean aBoolean = merchantService.updateOne(merchant);
        return aBoolean;
    }

    @ApiOperation("修改2")
    @PostMapping("/update2")
    public Boolean update2(@RequestBody Merchant merchant) {
        System.out.println(merchant.toString());
        Boolean aBoolean = merchantService.update2(merchant);
        return aBoolean;
    }

}
