package com.imooc.o2o.controller.admin;

import com.imooc.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("admin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value="getAreaList",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getAreaList(){
        Map<String,Object> resultDto = new HashMap<String, Object>();
        resultDto.put("code",0);
        resultDto.put("result",areaService.getAreaList());
        return resultDto;
    }

}
