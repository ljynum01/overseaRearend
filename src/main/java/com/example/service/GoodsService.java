package com.example.service;

import com.example.model.Goods;
import com.github.pagehelper.PageInfo;

public interface GoodsService {
    public PageInfo<Goods> findAllGood(Integer pageNum, Integer pageSize);

    public PageInfo<Goods> findGoodsBySid(Integer pageNum, Integer pageSize, Integer sid);

    public PageInfo<Goods> findGoodsByLid(Integer pageNum, Integer pageSize, Integer lid);

    public Goods findGoodsById(Integer id);

    public Boolean deleteGoodsById(Integer id);

    public Boolean addGoods(Goods goods);

    public Boolean updateGoods(Goods goods);
}
