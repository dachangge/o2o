package com.imooc.o2o.service;

import com.imooc.o2o.entity.Area;
import com.imooc.o2o.query.area.AreaQuery;
import com.imooc.o2o.util.PagerResult;

import java.util.List;

public interface AreaService {
    PagerResult<List<Area>> getAreaList(AreaQuery query);
}
