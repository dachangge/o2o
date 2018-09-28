package com.imooc.o2o.service;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.dto.ResultDto;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.PersonInfo;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.entity.ShopCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class ShopServiceTest extends BaseTest {
    @Autowired
    private ShopService shopService;

    @Test
    public void testAddShop(){
        Area area = new Area();
        area.setAreaId(1);
        PersonInfo person = PersonInfo.builder().userId(1L).build();
        ShopCategory shopCategory = ShopCategory.builder().shopCategoryId(1).build();
        Shop shop = Shop.builder().shopName("测试店铺1").shopDesc("testetstetetststet").shopAddr("一幢360").phone("18814867536").priority(1).area(area).owner(person).shopCategory(shopCategory).build();
        File file = new File("C:/Users/Administrator/Desktop/lalal.jpg");
        ResultDto<Shop> shopResultDto = shopService.addShop(shop, file);
        assertEquals(0,shopResultDto.getResult().getEnableStatus().intValue());
    }

}
