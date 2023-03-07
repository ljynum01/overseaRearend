package com.example.service.impl;

import com.example.mapper.AreaMapper;
import com.example.model.Area;
import com.example.service.AreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {

    @Resource
    private AreaMapper areaMapper;

    @Override
    public List<Area> selectAllArea() {
        List<Area> areas = areaMapper.selectByExample(null);
        return areas;
    }

    @Override
    public Boolean addArea(Area area) {
        return null;
    }

    @Override
    public Boolean deleteArea(Integer id) {
        return null;
    }

    @Override
    public Boolean updateArea(Area area) {
        return null;
    }
}
