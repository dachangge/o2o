package com.imooc.o2o.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shop {
    private Integer shopId;
    private String shopName;
    private String shopDesc;
    private String shopAddr;
    private String phone;
    private String shopImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    // -1 不可用，0 审核中， 1 可用
    private Integer enableStatus;
    //管理源给店家的意见
    private String advice;
    private Area area;

    private PersonInfo owner;
    private ShopCategory shopCategory;


}
