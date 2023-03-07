package com.example.service;

import com.example.model.Shopcar;

import java.util.List;

public interface ShopCarService {
    public Boolean addGoodForCar(Shopcar shopcar);

    public List<Shopcar> findAllByUid(Integer uid);

    public Boolean deleteOneById(Integer id);

    public Boolean increase(Integer id);

    public Boolean decrease(Integer id);
}
