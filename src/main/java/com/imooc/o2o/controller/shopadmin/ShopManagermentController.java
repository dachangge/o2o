package com.imooc.o2o.controller.shopadmin;

import com.imooc.o2o.dto.ResultDto;
import com.imooc.o2o.entity.Shop;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("shopadmin")
public class ShopManagermentController {
    @RequestMapping(value="registershop",method = RequestMethod.POST)
    private ResultDto<Shop> registerShop(HttpServletRequest req){
        return null;
    }
}
