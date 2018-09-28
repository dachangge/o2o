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
public class ShopCategory {
    private Integer shopCategoryId;
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String  shopCategoryImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    private ShopCategory parent;

}
