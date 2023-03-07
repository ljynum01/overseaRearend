package com.example.service;


import com.example.model.Area;

import java.util.List;

public interface AreaService {

    public List<Area> selectAllArea();

    public Boolean addArea(Area area);

    public Boolean deleteArea(Integer id);

    public Boolean updateArea(Area area);
}
