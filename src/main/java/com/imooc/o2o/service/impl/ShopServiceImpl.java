package com.imooc.o2o.service.impl;

import com.imooc.o2o.dao.ShopDao;
import com.imooc.o2o.dto.ResultDto;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.exception.O2oException;
import com.imooc.o2o.service.ShopService;
import com.imooc.o2o.util.ImageUtil;
import com.imooc.o2o.util.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.util.Date;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopDao shopDao;

    @Override
    @Transactional
    public ResultDto<Shop> addShop(Shop shop, File shopImg) {
        //空值判断
        if(shop == null){
            throw new O2oException("-1001","shop为null");
        }
        //给店铺附上初始值
        shop.setEnableStatus(0);
        shop.setCreateTime(new Date());
        shop.setLastEditTime(new Date());
        //添加店铺
        int effectNum = shopDao.insertShop(shop);
        if(effectNum <= 0){
            throw new O2oException("-1002","店铺创建失败");
        }else{
            if(shopImg != null){
                //存储图片
                addShopImg(shop,shopImg);
                //更新店铺图片地址
                effectNum =  shopDao.updateShop(shop);
                if(effectNum <= 0){
                    throw new O2oException("-1003","店铺图片上传失败");
                }
            }

        }
        return ResultDto.buildReturnSuccess(shop);

    }

    private void addShopImg(Shop shop, File shopImg) {
        //获取shop图片的相对值路径
        String shopImagePath = PathUtil.getShopImagePath(shop.getShopId());
        String path = ImageUtil.generateTunmbnail(shopImg, shopImagePath);
        shop.setShopImg(path);
    }
}










