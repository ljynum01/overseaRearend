package com.example.service;

import com.example.model.Consumer;

import java.util.List;

public interface ConsumerService {
    public Consumer findByid(Integer id);

    public List<Consumer> findAll();

    public Boolean deleteById(Integer id);

    public Boolean updateById(Consumer consumer);

    public Boolean delete(Consumer consumer);
}
