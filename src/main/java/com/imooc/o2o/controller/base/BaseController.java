package com.imooc.o2o.controller.base;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BaseController {
    public static Logger log = LoggerFactory.getLogger(BaseController.class);
    public static void sendJson(HttpServletResponse res,Object obj){
        try {
            res.setContentType("application/json;charset=utf-8");
            res.setCharacterEncoding("UTF-8");
            res.getWriter().print(JSON.toJSONString(obj));
            res.getWriter().flush();
            res.getWriter().close();
        } catch (IOException e) {
            e.printStackTrace();
            log.error("输出json错误");
        }
    }

}
