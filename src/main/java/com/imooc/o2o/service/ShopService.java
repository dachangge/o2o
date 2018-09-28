package com.imooc.o2o.service;

import com.imooc.o2o.dto.ResultDto;
import com.imooc.o2o.entity.Shop;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;

public interface ShopService {
    ResultDto<Shop> addShop(Shop shop, File shopImg);
}
