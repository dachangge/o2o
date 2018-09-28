package com.imooc.o2o.util;

import java.util.List;

/**
* @Description: 单一方法的借口,lambda表达式
* @Author: Mr.Deng
* @Date: 2018/9/28 16:13
*/
public interface Callback<T> {
    List<T> callback();
}
