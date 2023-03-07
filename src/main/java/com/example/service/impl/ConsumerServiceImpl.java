package com.example.service.impl;

import com.example.mapper.ConsumerMapper;
import com.example.mapper.UserRoleMapper;
import com.example.model.Consumer;
import com.example.model.UserRole;
import com.example.model.UserRoleExample;
import com.example.service.ConsumerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Resource
    private ConsumerMapper consumerMapper;

    @Resource
    private UserRoleMapper userRoleMapper;

    @Override
    public Consumer findByid(Integer id) {
        Consumer consumer = consumerMapper.selectByPrimaryKey(id);
        return consumer;
    }

    @Override
    public List<Consumer> findAll() {
        List<Consumer> consumers = consumerMapper.selectByExample(null);
        return consumers;
    }

    @Override
    public Boolean deleteById(Integer id) {
        int i = consumerMapper.deleteByPrimaryKey(id);
        return i>0;
    }

    @Override
    public Boolean updateById(Consumer consumer) {
        int i = consumerMapper.updateByPrimaryKeySelective(consumer);
        int i2 = 0;
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria()
                .andUsernameEqualTo(consumer.getOldName());
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        UserRole userRole = new UserRole();
        if (userRoles.size()>0) {
            userRole = userRoles.get(0);
            userRole.setUsername(consumer.getUname());
            i2 = userRoleMapper.updateByPrimaryKey(userRole);
        }
        return i + i2 > 0;
    }

    @Override
    public Boolean delete(Consumer consumer) {
        UserRoleExample userRoleExample = new UserRoleExample();
        userRoleExample.createCriteria()
                .andUsernameEqualTo(consumer.getUname());
        List<UserRole> userRoles = userRoleMapper.selectByExample(userRoleExample);
        UserRole userRole = userRoles.get(0);
        int i = userRoleMapper.deleteByPrimaryKey(userRole.getId());
        int i1 = consumerMapper.deleteByPrimaryKey(consumer.getUid());
        return i + i1 > 2;
    }
}
