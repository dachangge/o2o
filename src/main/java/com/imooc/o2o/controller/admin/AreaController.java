package com.imooc.o2o.controller.admin;

import com.imooc.o2o.controller.base.BaseController;
import com.imooc.o2o.dto.ResultDto;
import com.imooc.o2o.query.area.AreaQuery;
import com.imooc.o2o.service.AreaService;
import com.imooc.o2o.util.PagerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("admin")
public class AreaController extends BaseController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value="getAreaList")
    public void getAreaList(AreaQuery query, HttpServletResponse res){

        sendJson(res,ResultDto.buildReturnSuccess(areaService.getAreaList(query)));


    }

}
