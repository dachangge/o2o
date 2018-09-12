package com.imooc.o2o.dao;

import com.imooc.o2o.entity.Shop;

public interface ShopDao  {
    /**
    * @Description:  新增店铺
    * @param [shop]
    */
    int insertShop(Shop shop);

    /**
    * @Description: 更新店铺信息
    * @param [shop]
    */
    int updateShop(Shop shop);
}
