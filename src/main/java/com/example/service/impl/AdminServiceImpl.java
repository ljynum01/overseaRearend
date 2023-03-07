package com.example.service.impl;

import com.example.mapper.AdminMapper;
import com.example.mapper.RoleMapper;
import com.example.mapper.UserRoleMapper;
import com.example.model.Admin;
import com.example.model.AdminExample;
import com.example.model.UserRole;
import com.example.model.UserRoleExample;
import com.example.service.AdminService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminMapper adminMapper;

    @Resource
    private UserRoleMapper userRoleMapper;

//    @Override
//    public Boolean addAdmin(Admin admin) {
//        int insert = adminMapper.insert(admin);
//        if (insert>0){
//            return true;
//        }
//        return false;
//    }

    @Override
    public Boolean deleteAdmin(Integer aid) {
        int i = adminMapper.deleteByPrimaryKey(aid);
        if (i>0) {
            return true;
        }
        return false;
    }

    @Override
    public List<Admin> selectAllAdmin(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Admin> admins = adminMapper.selectByExample(null);
        return admins;
    }

    @Override
    public Boolean updateAdmin(Admin admin) {
        int i = adminMapper.updateByPrimaryKeySelective(admin);
        if (i>0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateAdmin2(Admin admin) {
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria()
                .andUsernameEqualTo(admin.getOldName());
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        UserRole userRole = userRoles.get(0);
        userRole.setUsername(admin.getAname());
        int i = userRoleMapper.updateByPrimaryKeySelective(userRole);
        int i1 = adminMapper.updateByPrimaryKeySelective(admin);
        return i+i1>2;
    }

    @Override
    public Admin selectById(Integer id) {
        Admin admin = adminMapper.selectByPrimaryKey(id);
        return admin;
    }

    @Override
    public Admin selectByName(String username) {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria()
                .andAnameEqualTo(username);
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        return admins.get(0);
    }
}
