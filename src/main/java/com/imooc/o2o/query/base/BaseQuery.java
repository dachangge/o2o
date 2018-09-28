package com.imooc.o2o.query.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class BaseQuery {

    private String keyWords;
    private Integer currentNum;
    private Integer pageSize;
}
