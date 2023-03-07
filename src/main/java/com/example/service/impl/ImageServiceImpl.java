package com.example.service.impl;

import com.example.mapper.ImageMapper;
import com.example.model.Image;
import com.example.model.ImageExample;
import com.example.service.ImageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {

    @Resource
    private ImageMapper imageMapper;

    @Override
    public Boolean saveImage(String imgUrl, Integer cid) {
        Image image = new Image();
        image.setImage(imgUrl);
        image.setCid(cid);
        int insert = imageMapper.insert(image);
        return insert>0;
    }

    @Override
    public Boolean updateImage(String imgUrl, Integer cid) {
        int i=0;
        ImageExample imageExample = new ImageExample();
        imageExample.createCriteria()
                .andCidEqualTo(cid);
        Image image = new Image();
        image.setImage(imgUrl);
        image.setCid(cid);
        List<Image> images = imageMapper.selectByExample(imageExample);
        if (images.size()>0) {
            i = imageMapper.updateImage(image);
        }else {
            i = imageMapper.insertSelective(image);
        }

        return i>0;
    }
}
