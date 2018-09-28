package com.imooc.o2o.service.impl;

import com.imooc.o2o.dao.AreaDao;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.query.area.AreaQuery;
import com.imooc.o2o.service.AreaService;
import com.imooc.o2o.util.PagerResult;
import com.imooc.o2o.util.PagerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AreaServiceImpl implements AreaService {
    Logger log = LoggerFactory.getLogger(AreaServiceImpl.class);

    @Autowired
    private AreaDao areaDao;

    @Override
    public PagerResult<List<Area>> getAreaList(AreaQuery query) {
        log.info("=== Start ===");
        long startTime = System.currentTimeMillis();
        PagerResult<List<Area>> res = PagerUtil.excute(() -> areaDao.queryArea(query), query);
        log.error("test error ！");
        log.info("=== ENd ===");
        long endTime = System.currentTimeMillis();
        log.debug("用時，[{}ms]", endTime-startTime);
        return res;
    }
}
