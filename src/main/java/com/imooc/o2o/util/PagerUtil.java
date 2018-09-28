package com.imooc.o2o.util;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @Description: 分页工具类
* @Author: Mr.Deng
* @Date: 2018/9/28 15:39
*/
public class PagerUtil {
 public static <T> PagerResult<List<T>> excute(Callback callback,Object obj){
     Class clazz = obj.getClass();
     clazz = clazz.getSuperclass();
     Map<String,Object> map= new HashMap<String,Object>();
     Field[] fields = clazz.getDeclaredFields();
     for (int i = 0; i<fields.length; i++){

         try {
             //得到属性
             Field field = fields[i];
             //打开私有属性访问限制
             field.setAccessible(true);
             //获取属性名字
             String name = field.getName();
             //获得属性值
             Object value = field.get(obj);
             map.put(name,value);
         } catch (IllegalAccessException e) {
             e.printStackTrace();
         }
     }


     PageHelper.startPage((int)map.get("currentNum"),(int)map.get("pageSize"));

     List<T> list = callback.callback();

     PageInfo pageInfo = new PageInfo(list);

     PagerResult<List<T>> pagerResult = new PagerResult<>(pageInfo.getTotal(), list);

     return  pagerResult;
 }
}
