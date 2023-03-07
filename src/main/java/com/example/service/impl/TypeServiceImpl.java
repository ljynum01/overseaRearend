package com.example.service.impl;

import com.example.mapper.TypeMapper;
import com.example.model.Type;
import com.example.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Resource
    private TypeMapper typeMapper;

    @Override
    public List<Type> selectAllType() {
        List<Type> types = typeMapper.selectByExample(null);
        return types;
    }

    @Override
    public Boolean addType(Type type) {
        int insert = typeMapper.insert(type);
        if (insert>0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean delete(Integer id) {
        int i = typeMapper.deleteByPrimaryKey(id);
        return i>0;
    }

    @Override
    public Boolean update(Type type) {
        int i = typeMapper.updateByPrimaryKeySelective(type);
        return i>0;
    }
}
