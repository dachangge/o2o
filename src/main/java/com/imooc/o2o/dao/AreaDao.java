package com.imooc.o2o.dao;

import java.util.List;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.query.area.AreaQuery;

public interface AreaDao {
    /**
    * @Description: 列出区域列表
    * @Return: java.util.List<com.imooc.o2o.entity.Area>
    * @Date: 2018/9/7 17:42
    */
    List<Area> queryArea(AreaQuery query);
}
