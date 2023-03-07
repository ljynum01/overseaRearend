package com.example.service.impl;

import com.example.mapper.CommentMapper;
import com.example.mapper.GoodsMapper;
import com.example.mapper.ImageMapper;
import com.example.model.CommentExample;
import com.example.model.Goods;
import com.example.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;

    @Resource
    private ImageMapper imageMapper;

    @Resource
    private CommentMapper commentMapper;


    @Override
    public PageInfo<Goods> findAllGood(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Goods> allGoods = goodsMapper.findAllGoods();
        PageInfo<Goods> pageInfo = new PageInfo<>(allGoods, pageNum);
        System.out.println(pageInfo.toString());
        return pageInfo;
    }

    @Override
    public PageInfo<Goods> findGoodsBySid(Integer pageNum, Integer pageSize, Integer sid) {
        PageHelper.startPage(pageNum, pageSize);
        List<Goods> goodsBySid = goodsMapper.findGoodsBySid(sid);
        PageInfo<Goods> pageInfo = new PageInfo<>(goodsBySid, pageNum);
        return pageInfo;
    }

    @Override
    public PageInfo<Goods> findGoodsByLid(Integer pageNum, Integer pageSize, Integer lid) {
        PageHelper.startPage(pageNum, pageSize);
        List<Goods> goodsByLid = goodsMapper.findGoodsByLid(lid);
        PageInfo<Goods> pageInfo = new PageInfo<>(goodsByLid, pageNum);
        return pageInfo;
    }

    @Override
    public Goods findGoodsById(Integer id) {
        Goods goodsByid = goodsMapper.findGoodsByid(id);
        return goodsByid;
    }

    @Override
    public Boolean deleteGoodsById(Integer id) {
        int i = goodsMapper.deleteByPrimaryKey(id);
        CommentExample commentExample = new CommentExample();
        commentExample.createCriteria()
                .andCidEqualTo(id);
        int i1 = commentMapper.deleteByExample(commentExample);
        return i>0?true:false;
    }

    @Override
    public Boolean addGoods(Goods goods) {
        int insert = goodsMapper.insertSelective(goods);
        return insert>0?true:false;
    }

    @Override
    public Boolean updateGoods(Goods goods) {
        int i = goodsMapper.updateByPrimaryKey(goods);
        return i>0;
    }
}
