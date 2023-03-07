package com.example.controller;

import com.example.model.Admin;
import com.example.service.AdminService;
import com.example.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags="管理员接口")
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private AdminService adminService;

    @Resource
    private UserService userService;

    @ApiOperation("查询所有管理员")
    @GetMapping("/findAll")
    public List<Admin> findAll(@RequestParam(defaultValue ="1") Integer pageNum,
                               @RequestParam(defaultValue = "10") Integer pageSize){
        List<Admin> admins = adminService.selectAllAdmin(pageNum, pageSize);
        return admins;
    }

//    @ApiOperation("添加一条管理员记录")
//    @PostMapping("/insertOne")
//    public Boolean insertOne(@RequestParam("uesrname") String username, @RequestParam("password") String password) {
//        Boolean aBoolean1 = userService.userInexistence(username);
//        if (aBoolean1) {
//            Admin admin = new Admin();
//            admin.setAname(username);
//            admin.setApasswd(password);
//            Boolean aBoolean = adminService.addAdmin(admin);
//            return aBoolean;
//        }else {
//            return false;
//        }
//    }
//
//    @ApiOperation("insert")
//    @PostMapping("/inset")
//    public Admin insert(@RequestBody Admin admin) {
//        return admin;
//    }

    @ApiOperation("更新一条管理员记录")
    @PostMapping("/update")
    public Boolean updateOne(@RequestParam("uesrname") String username, @RequestParam("password") String password) {
        Admin admin = new Admin();
        admin.setAname(username);
        admin.setApasswd(password);
        Boolean aBoolean = adminService.updateAdmin(admin);
        return aBoolean;
    }

    @ApiOperation("根据id查询")
    @GetMapping("/findById")
    public Admin findById(@RequestParam("id") Integer id) {
        Admin admin = adminService.selectById(id);
        return admin;
    }

    @ApiOperation("根据用户名查找")
    @GetMapping("/findByName")
    public Admin findByName(@RequestParam("username") String username) {
        Admin admin = adminService.selectByName(username);
        return admin;
    }

    @ApiOperation("删除一条管理员记录")
    @GetMapping("/delete")
    public Boolean deleteOne(@RequestParam("id") Integer id) {
        Boolean aBoolean = adminService.deleteAdmin(id);
        return aBoolean;
    }

    @ApiOperation("修改管理员信息")
    @PostMapping("/update2")
    public Boolean update(@RequestBody Admin admin) {
        System.out.println(admin.toString());
        Boolean aBoolean = adminService.updateAdmin2(admin);
        return aBoolean;
    }

}
