package com.example.service;

import com.example.model.Type;

import java.util.List;

public interface TypeService {

    public List<Type> selectAllType();

    public Boolean addType(Type type);

    public Boolean delete(Integer id);

    public Boolean update(Type type);
}
