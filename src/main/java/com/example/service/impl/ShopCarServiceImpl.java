package com.example.service.impl;

import com.example.mapper.ConsumerMapper;
import com.example.mapper.GoodsMapper;
import com.example.mapper.ShopcarMapper;
import com.example.model.Shopcar;
import com.example.model.ShopcarExample;
import com.example.service.ShopCarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShopCarServiceImpl implements ShopCarService {

    @Resource
    private ConsumerMapper consumerMapper;

    @Resource
    private GoodsMapper goodsMapper;

    @Resource
    private ShopcarMapper shopcarMapper;

    @Override
    public Boolean addGoodForCar(Shopcar shopcar) {
        ShopcarExample shopcarExample = new ShopcarExample();
        shopcarExample.createCriteria()
                .andUidEqualTo(shopcar.getUid())
                .andCidEqualTo(shopcar.getCid());
        List<Shopcar> shopcars = shopcarMapper.selectByExample(shopcarExample);
        if (shopcars.size()>0) {
            Shopcar shopcar1 = shopcars.get(0);;
            shopcar1.setNumber(shopcar1.getNumber() + shopcar.getNumber());
            int i = shopcarMapper.updateByPrimaryKeySelective(shopcar1);
            if (i>0) {
                return true;
            }
        }else {
            int insert = shopcarMapper.insert(shopcar);
            if (insert>0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Shopcar> findAllByUid(Integer uid) {
        List<Shopcar> shopcars = shopcarMapper.findAllByUid(uid);
        shopcars.forEach(shopcar -> {
            Integer gid = shopcar.getCid();
        });
        return shopcars;
    }

    @Override
    public Boolean deleteOneById(Integer id) {
        int i = shopcarMapper.deleteByPrimaryKey(id);
        if (i>0) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Boolean increase(Integer id) {
        Shopcar shopcar = shopcarMapper.selectByPrimaryKey(id);
        shopcar.setNumber(shopcar.getNumber() + 1);
        int i = shopcarMapper.updateByPrimaryKeySelective(shopcar);
        return i>0;
    }

    @Override
    public Boolean decrease(Integer id) {
        Shopcar shopcar = shopcarMapper.selectByPrimaryKey(id);
        int i = 0;
        if (shopcar.getNumber()-1 == 0) {
            i = shopcarMapper.deleteByPrimaryKey(id);
        }else {
            shopcar.setNumber(shopcar.getNumber() - 1);
            i = shopcarMapper.updateByPrimaryKeySelective(shopcar);
        }
        return i>0;
    }
}
