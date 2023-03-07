package com.example.service.impl;

import com.example.mapper.*;
import com.example.model.*;
import com.example.service.UserService;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRoleMapper userRoleMapper;

    @Resource
    private AdminMapper adminMapper;

    @Resource
    private MerchantMapper merchantMapper;

    @Resource
    private ConsumerMapper consumerMapper ;


    @Override
    public Object login(String username, String password) {
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria()
                .andUsernameEqualTo(username);
        List<UserRole> userRoles  = userRoleMapper.selectByExample(userRoleExample);
        if (userRoles.size()>0){
            UserRole userRole = userRoles.get(0);
            if (userRole.getRid()==1){
                AdminExample adminExample = new AdminExample();
                adminExample.createCriteria()
                        .andAnameEqualTo(username)
                        .andApasswdEqualTo(password);
                List<Admin> admins = adminMapper.selectByExample(adminExample);
                if (admins.size()>0){
                    LoginResultMap admin = new LoginResultMap(admins.get(0).getAid(),username,"admin");
                    return admin;
                }
                return null;
            }else if (userRole.getRid()==2){
                MerchantExample merchantExample = new MerchantExample();
                merchantExample.createCriteria()
                        .andSnameEqualTo(username)
                        .andSpasswdEqualTo(password);
                List<Merchant> merchants = merchantMapper.selectByExample(merchantExample);
                if (merchants.size()>0){
                    LoginResultMap merchant = new LoginResultMap(merchants.get(0).getSid(),username,"merchant");
                    return merchant;
                }
                return  null;
            }else if (userRole.getRid()==3){
                ConsumerExample consumerExample = new ConsumerExample();
                consumerExample.createCriteria()
                        .andUnameEqualTo(username)
                        .andUpasswdEqualTo(password);
                List<Consumer> consumers = consumerMapper.selectByExample(consumerExample);
                if (consumers.size()>0){
                    LoginResultMap consumer = new LoginResultMap(consumers.get(0).getUid(),username,"consumer");
                    return consumer;
                }
                return null;
            }
        }
        return null;
    }

//    @Override
//    public Boolean logout(String username, String password) {
//        return null;
//    }

    @Override
    public Boolean MerchantRegister(String username, String password) {
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria()
                .andUsernameEqualTo(username);
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        if (userRoles.size()>0) {
            return false;
        }else {
            Merchant merchant = new Merchant();
            merchant.setSname(username);
            merchant.setSpasswd(password);
            int insert = merchantMapper.insert(merchant);
            UserRole userRole = new UserRole();
            userRole.setUsername(username);
            userRole.setRid(2);
            int insert1 = userRoleMapper.insert(userRole);
            return insert+insert1 == 2;
        }
    }

    @Override
    public Boolean ConsumerRegister(String username, String password) {
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria()
                .andUsernameEqualTo(username);
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        if (userRoles.size()>0) {
            return false;
        }else {
            Consumer consumer = new Consumer();
            consumer.setUname(username);
            consumer.setUpasswd(password);
            consumer.setRole(3);
            int insert = consumerMapper.insert(consumer);
            UserRole userRole = new UserRole();
            userRole.setUsername(username);
            userRole.setRid(3);
            int insert1 = userRoleMapper.insert(userRole);
            return insert+insert1 == 2;
        }
    }


    @Override
    public Boolean userInexistence(String username) {
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria()
                .andUsernameEqualTo(username);
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        if (userRoles.size()>0) {
            return false;
        }
        return true;
    }
//
//    @Override
//    public Integer deleteByid(Integer id) {
//        int i = userRoleMapper.deleteByPrimaryKey(id);
//        return i;
//    }
}
